package com.learning.java.versions;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class HashMapReverse {

    public static void reverseMap(Map<String, Integer> hm,Integer flag){
       Map<String,Integer> map = new HashMap<String,Integer>();
       switch (flag){
           case(1):
               map= hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                   .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2,LinkedHashMap::new));
               System.out.println("Sorted map in java 8 in order"+ map);
               break;
           case(2):
               map= hm.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                       .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e2,LinkedHashMap::new));
               System.out.println("Sorted map in java 8 in reverse order"+ map);
               //break;
       }

     //  return map;

    }

    public static void main(String[] args) {

        Map<String,Integer> hm= new HashMap<String,Integer>();

        hm.put("A",11);
        hm.put("B",18);
        hm.put("C",12);
        hm.put("D",1);
        hm.put("E",14);
        hm.put("F",2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.addAll(hm.entrySet());
        System.out.println("Here map as entrySet in list"+ list);

        Comparator<Map.Entry<String,Integer>> cmp = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Collections.sort(list,cmp);
       // System.out.println("Here post sorting list"+ list);

        Map<String,Integer> newMap = new LinkedHashMap<>();

        Iterator<Map.Entry<String,Integer>> iterator= list.listIterator();
        while(iterator.hasNext()) {
            Map.Entry<String,Integer> newMap1 = iterator.next();
            newMap.put(newMap1.getKey(),newMap1.getValue());
        }

     // System.out.println("Final sorted map is:: "+ newMap);

       reverseMap(hm,1);

        // Frequency using Java 8  groupingBy method
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequencyMap = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Frq" +frequencyMap);

        Map<String, Long> frequencyMap1 = new HashMap<>();
        words.stream().forEach(p->frequencyMap1.compute(p,(k,v)-> v== null ? 1 : v+1));
        words.stream().forEach(p->frequencyMap1.put(p, frequencyMap.getOrDefault(p,0L)+1));
        Map<String,Long> hmap = words.stream().collect(Collectors.toMap(x -> x, x -> 1L, Long::sum));

        String  m = "Priyanshu Parashar";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: m.toCharArray()){
            map.compute(c,(k, v)->  (v==null) ? 1: v+1);
        }
        System.out.println(map);




    }
}
