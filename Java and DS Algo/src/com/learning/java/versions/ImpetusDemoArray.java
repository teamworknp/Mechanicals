package com.learning.java.versions;

import java.util.*;
import java.util.stream.Collectors;

public class ImpetusDemoArray {
    public static void main(String[] args) {
        int array[] ={1,1,2,2,2,3,3,3,3,4,4,5};
        // desired ouput =sorted - 3,3,3,3,2,2,2,1,1,4,4,5

        // first calculate freq / sorting

        List<Integer> list = Arrays.asList(1,1,2,2,2,3,3,3,3,4,4,5);

        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for(int x: list){
            //hmap.compute(x,(k,v)-> (v==null) ?1 : v+1);
            hmap.put(x, hmap.getOrDefault(x,0)+1);
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hmap.get(o2).compareTo(hmap.get(o1));
            }
        };

        list.sort((x, y) -> hmap.get(y).compareTo(hmap.get(x)));
      //  list.sort((x, y) -> hmap.get(y).compareTo(hmap.get(x)));
        //Collections.sort(list, comparator);
        System.out.println(list);





    }
}
