package com.learning.java.versions;
import com.dynamic.programming.InheritanceParentDemo;
public class InheritanceDemoOutPackage extends InheritanceParentDemo{

     protected InheritanceDemoOutPackage(){

    }

     public void m1() {
        System.out.println("m1 in child InheritanceDemoOutPackage");
    }

    @Override
    public void printMessage(){
        System.out.println("Bar!");
    }

    public static void main(String[] args) {
        InheritanceParentDemo demo = new InheritanceDemoOutPackage();
        demo.printMessage();

        InheritanceParentDemo demo1 = new InheritanceDemoOutPackage();
        demo1.m1();
    }

}
