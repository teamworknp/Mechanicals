package com.learning.java.versions;

class MyThread implements Runnable {
     volatile int counter=0;

    public int getCounter() throws InterruptedException {
        return counter++;
    }

    @Override
     public void run() {
        for(int i=0; i< 5 ;i++){
            try {
                getCounter();
                System.out.println("counter value is incremented  by "+ counter + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JavaVolatileThread {

    public static void main(String[] args) throws InterruptedException {
    MyThread object = new MyThread();

    Thread t1 = new Thread(object);
    Thread t2 = new Thread(object);

    t1.start();
    t2.start();

    System.out.println("In Main " + object.counter);
    }
}
