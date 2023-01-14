package com.learning.java.versions;

import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;

public class Java_8_compute {
    public static void main(String[] args) {
        String text = "Ann while Bob had had had had had had had had had had had a better effect on on the teacher";
        Map<String, Integer> freqMap = new HashMap<>();
        List<String> list = List.of(text);
        System.out.println(list);

        List<int []> listArray = new ArrayList<>();
        listArray.add(new int[]{1, 2, 3});
        listArray.add(new int[]{4, 5, 6});
        listArray.add(new int[]{7, 8, 9});
        System.out.println("List array: " + listArray);

      //  listArray.stream().sorted().forEach(System.out::println);

       OptionalInt results = listArray.stream().mapToInt(p-> Arrays.stream(p).sum()).reduce(Integer::sum);
        System.out.println(results.orElse(0));

    }
}
