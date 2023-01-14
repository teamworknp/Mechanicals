package com.learning.java.versions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaPredicate {

    public static void main(String[] args) {

        // Predicate uses test()
        // Consumer accept()
        // Function apply()
        // Supply  get()

        List<Integer> list = Arrays.asList(2,5,7,8,9,1,6,9);
        Consumer<Integer> consumer = x -> System.out.println(x);
        list.forEach(consumer);

        // BiConsumer
        BiConsumer<String,Integer> biConsumer = (x, y) -> System.out.println(x+ ":"+ (y * 3));
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("k1",100);
        map.put("k2",200);
        map.put("k3",300);
        map.put("k4",200);
        map.put("k5",100);
        map.put("k6",50);
        map.put("k7",10);
        map.forEach(biConsumer);

        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        list.stream().forEach( key -> result.compute(key,(k,v)-> v ==null ? 1 : v+1));
        System.out.println(result);

        int arr [] ={1,3,5,8,9,2};
        int arr1[] = new int[arr.length];
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int a : list1){
            System.out.println(a);;
        }
       // Arrays.sort();
        Predicate<Integer> preBool = p-> p >18;
        boolean isAccepted = preBool.test(19);
        System.out.println(isAccepted);

    }
}
