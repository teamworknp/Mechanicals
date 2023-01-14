package com.learning.java.versions;

class Producer implements Runnable{

    @Override
    public void run() {
        System.out.println("Producer! - running");
        produce();
    }

    private static void produce() {
        for(int i=0;i<5;i++){
            System.out.println("Producer Thread" + i);
        }
    }
}


class Consumer implements Runnable{

    @Override
    public void run() {
        System.out.println("Consumer! - running");
        consume();
    }

    private static void consume() {
        for(int i=0;i<5;i++){
            System.out.println("Consumer Thread" + i);
        }
    }
}


public class ThreadsDemo {

    ThreadsDemo threadsDemo= new ThreadsDemo();

    Producer p1= new Producer();
    Thread t1 = new Thread(p1);
    Consumer c1 = new Consumer();
    Thread t2 = new Thread(c1);


}
