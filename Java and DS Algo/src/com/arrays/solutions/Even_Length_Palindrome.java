package com.arrays.solutions;

public class Even_Length_Palindrome {
    private static boolean extracted(String s) {
        int len = s.length();
        boolean isPal = false;
        System.out.println(len);
        for(int i=0;i < len;i++) {
           for(int j = len-1;j >= 0;j--) {
               if(s.charAt(i) == s.charAt(j)){
                  isPal =true;
               }else{
                   isPal = false;
               }
           }
        }
        return isPal;
    }
    public static void main(String[] args) {
        String s ="a b  b a";
        String x = s.replaceAll("\\s","");
        System.out.println(x);
        System.out.println(extracted(s));

        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }

}
