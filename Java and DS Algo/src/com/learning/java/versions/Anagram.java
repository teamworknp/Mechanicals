package com.learning.java.versions;

import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("HITLER", "LERTGIH"));
        String s1 = "HITLER";
        String s2 = "LITERH";
        Map<Character, Integer> hm = new HashMap<>();

        System.out.println("size of map " +hm.size());
        for (char c: s1.toCharArray()) {
            if (!hm.containsKey(c)) {
                hm.put(c, 1);
            } else {
                hm.put(c, hm.get(c)+1);
            }
        }
       System.out.println("hashmap is  "+hm.size());

        for (char c: s2.toCharArray()) {
            if (hm.containsKey(c)) {
                System.out.println("element in hm is " +hm);
                hm.remove(c,hm.get(c));
            }
        }
        System.out.println("hashmap condition now is  "+hm.size());

        if(hm.size()< 0){
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anangram");
        }
    }
    }

