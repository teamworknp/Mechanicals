package com.learning.java.versions;

import java.util.*;
import java.util.stream.Collectors;

public class TryingConcepts {

    public static Map<String, Integer> reverseHashMap(Map<String,Integer> hm){
        List<Map.Entry<String, Integer>> listMap = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
        Map<String, Integer> map = listMap.stream().
                sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
       return map;
     }

     public static int factorial(int input){
       return input <=1 ? 1 : input * factorial(input-1);
     }

     public static String reverseRecursion(String s){
        if(s.length()<=1){
            return s;
        }
        return reverseRecursion(s.substring(1))+ s.charAt(0);
     }



    public static void main(String[] args) {
       Map<String, Integer> map = new HashMap<String, Integer>();
       map.put("A",12);
       map.put("B",14);
       map.put("C",11);
       map.put("D",10);
       System.out.println("HashMap: " + map);
       System.out.println(reverseHashMap(map));
       System.out.println(factorial(0));
       String result ="Welcome to wonderland";
       String token="";
       String temp="";
        for (String s : result.split(" ")) {
            token =s;
        temp+=reverseRecursion(token) + " ";
        }
        System.out.println(temp);
    }
}
