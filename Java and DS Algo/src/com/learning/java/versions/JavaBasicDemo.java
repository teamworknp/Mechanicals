package com.learning.java.versions;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Base{
    protected String value ="Priyanshu";


    String m1() throws IOException{
        System.out.println("M1 in Base");
        return "m1";
    }

}

class Derived extends Base{


        String m1() throws IOException{
        System.out.println("M1 in Derived");
        return "m1";
    }

     static String value ="Parashar";

}


public class JavaBasicDemo {

    public static void main(String[] args) {
        Derived b = new Derived();
        System.out.println(b.value);

        Map<String,String> stringStringMap= new ConcurrentHashMap<String,String>();



    }

}
