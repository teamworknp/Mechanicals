package com.learning.java.versions;

 sealed class SealedDemon permits A,B {
    public static void main(String[] args) {
    char c = 'A';
    char b ='B';
        System.out.println(c+b);
    }
}
 final class A extends SealedDemon {

 }

 final class B extends SealedDemon {

 }

//class M extends SealedDemon{
//
//}