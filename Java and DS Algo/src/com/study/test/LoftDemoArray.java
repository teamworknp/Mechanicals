package com.study.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoftDemoArray {


    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 11, 9, 11, 90, 70, 15};

// Remove duplicates and sort the array
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        int[] sortedArr = set.stream().sorted().mapToInt(i -> i).toArray();
        for(int x: sortedArr) {
            System.out.println(x);
        }
        //1,5,9,11,15,70,90
        List<Integer> result = new ArrayList<>();

        }


    }

