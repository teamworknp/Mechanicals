package com.learning.java.versions;

public class ReverseNumber {
    public static void main(String[] args) {
        int input =1234;
        int temp = input;
        int result=0;
        while(input>0){
            int rem = input%10;
            result = result * 10 + rem; // 4, 43, 432, 4321
            input = input/10;
        }
        System.out.println(result);
    }
}
