package com.dynamic.programming;

import com.learning.java.versions.InheritanceDemoOutPackage;

public class InheritanceDemoSamePackage extends InheritanceParentDemo {

    public static void main(String[] args) {
        InheritanceParentDemo demo= new InheritanceDemoSamePackage();
        demo.m1();
    }
}
