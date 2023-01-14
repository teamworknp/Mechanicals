package com.learning.java.versions;

public class LuxsoftDemoThread {

    final int num=10;

    public void display(){
        int num=12;
        Runnable r = new MyThread(){
            final int num = 15;
            public void run() {
                int num = 20;
                System.out.println(num);
                System.out.println(this.num);
            }
        };
        r.run();
    }
    public static void main(String[] args) {
        LuxsoftDemoThread luxsoftDemoThread= new LuxsoftDemoThread();
        luxsoftDemoThread.display();
    }
}
