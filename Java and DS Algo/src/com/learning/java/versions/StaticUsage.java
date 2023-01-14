package com.learning.java.versions;

public class StaticUsage {
    static int x = 0;

    static {
        x = 12;
    }

    static {
        x = 15;
    }

    public StaticUsage(){
         x=90;
    }

    static {
        x = 10;
    }

    public static void main(String[] args) {
        System.out.println(x);
        StaticUsage usage = new StaticUsage();
        System.out.println(x);

    }
}
