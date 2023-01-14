package com.study.test;

import java.util.concurrent.CountDownLatch;

public class EvenOddDemo {

        private static final CountDownLatch evenLatch = new CountDownLatch(0);
        private static final CountDownLatch oddLatch = new CountDownLatch(0);
        private static final Object lock = new Object();
        private static volatile boolean isEven = true;

        static class EvenPrinter implements Runnable {
            private final int max;

            public EvenPrinter(int max) {
                this.max = max;
            }

            @Override
            public void run() {
                for (int i = 0; i < max; i+=2) {
                    synchronized (lock) {
                        while (!isEven) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        System.out.println(i);
                        isEven = false;
                        lock.notify();
                        oddLatch.countDown();
                    }
                }
            }
        }

        static class OddPrinter implements Runnable {
            private final int max;

            public OddPrinter(int max) {
                this.max = max;
            }

            @Override
            public void run() {
                for (int i = 0; i < max; i+=2) {
                    synchronized (lock) {
                        while (isEven) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        System.out.println(i);
                        isEven = true;
                        lock.notify();
                        evenLatch.countDown();
                    }
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Thread evenThread = new Thread(new EvenPrinter(10), "Even-Thread");
            Thread oddThread = new Thread(new OddPrinter(10), "Odd-Thread");

            oddThread.start();
            evenThread.start();

           oddThread.join();
           evenThread.join();
        }
    }

