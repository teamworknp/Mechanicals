package com.learning.java.versions;

import java.io.IOException;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;


public class IntellDemo {
        //CountDownLatch countDownLatch= new CountDownLatch(EXEC);
        int threadCounter = 1;
        static int EXEC =100;
        public void printEven() {
            synchronized (this) {
                // Print number till the N
                while (threadCounter < 5) {
                    while (threadCounter % 2 == 0) {
                        try {
                            wait();
                        }
                        catch (InterruptedException e) {
                        }
                    }
                    System.out.print(Thread.currentThread().getName()+ threadCounter + "\n");
                    threadCounter++;
                  //  System.out.println("ThreadCounter in even : " + threadCounter);
                    notify();
                }
            }
        }

        public void printOdd() {
            synchronized (this) {
                while (threadCounter < 5) {
                    while (threadCounter % 2 == 1) {
                        try {
                            wait();
                        }
                        catch (InterruptedException e) {
                        }
                    }
                    System.out.print(Thread.currentThread().getName()+ threadCounter+ "\n" );
                    threadCounter++;
                    //System.out.println("ThreadCounter in odd: " + threadCounter);
                    notify();
                }
            }
        }

        public static void main(String[] args) throws IOException {


         // String [][] matrix ={{"a", "b", "c"},{"d","e","f"}};
        //  String element = matrix[2][3];
            //  System.out.println(element);

//            List original = List.of("A");
//            List derived = new ArrayList(original);
//            original.add(1,"B");
//            System.out.println(derived);

           // Stream.of(2,4,8,16,32).mapToInt(num->num/2).filter(num->num>5).limit(2).peek(System.out::println);




            IntellDemo demo = new IntellDemo();
            Thread t1 = new Thread(new Runnable() {
                public void run()
                {
                    demo.printEven();
                }
            });

            Thread t2 = new Thread(new Runnable() {
                public void run()
                {
                    demo.printOdd();
                }
            });

           t1.start();
           t2.start();

        }
    }

