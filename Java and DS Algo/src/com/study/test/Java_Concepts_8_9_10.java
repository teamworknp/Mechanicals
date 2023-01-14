package com.study.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_Concepts_8_9_10 {
    public static void main(String[] args) {
    // Flattening the stream
        List<Integer> ls = List.of(1,2,1,3);
        List<Integer> ls1 = List.of(11,12,13,14);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(ls);
        list.add(ls1);

        Stream<Integer> streamList = list.stream().flatMap(lists->lists.stream());
        List<Integer> newList =  list.stream().flatMap(l->l.stream().sorted()).collect(Collectors.toList());
        System.out.println(newList);

        Set<Integer> set = newList.stream().collect(Collectors.toSet());
        System.out.println(set);

        Set<String> setStr =set.stream().map(p->p.toString()).collect(Collectors.toSet());
        System.out.println(setStr);

    // java 10 onwards we can write the type in left side and assign it to var
    var result = new ArrayList<Integer>();
    result.add(1);
    result.add(2);
    result.add(1);
    result.add(2);
    System.out.println(result);


    }
}
