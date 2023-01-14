package com.learning.java.versions;

import java.io.FilterOutputStream;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseStringInJava {
    // reverse string builder
    static String reversalUsingStack(String input){
    StringBuilder reverseString = new StringBuilder();
    StringTokenizer st = new StringTokenizer(input," ");
    Stack<String> stringsStack = new Stack<String>();

    while(st.hasMoreTokens()){
        stringsStack.push(st.nextToken());
    }

    while(!stringsStack.empty()){
        reverseString.append(stringsStack.pop() + " ");
    }


    return reverseString.toString();
    }
    static String reverseTheWord(String input){
        StringBuilder sb= new StringBuilder();
        String [] token  = input.split(" ");

        for(String word : token){
            String reverse = new StringBuilder().append(word).reverse().toString();
            sb.append(reverse + " ");
        }
        return sb.toString().trim();
    }
    static String reverseString(String input){

        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        String reverse = "";
        String token = null;
        while(tokenizer.hasMoreTokens()){
            token =  tokenizer.nextToken();
            reverse =  token + " " +reverse;
        }
        return reverse;
    }

    public static String reverseRecursively(String input){
    if(input.length() == 0 || input.length() == 1){
        return input;
    }
    return reverseRecursively(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
    String s1 = "I work in dell";
        System.out.println(reversalUsingStack(s1)); //dell in work I
        System.out.println(reverseTheWord(s1)); // I krow ni lled
        System.out.println(reverseString(s1)); // dell in work I
        System.out.println(reverseRecursively("Hello!")); //!olleH
    }
}
