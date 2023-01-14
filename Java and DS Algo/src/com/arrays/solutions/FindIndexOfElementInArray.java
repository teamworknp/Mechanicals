package com.arrays.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
* Input: a[] = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }, K = 5
Output: 0

Input: a[] = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }, K = 7
Output: 6
* */
public class FindIndexOfElementInArray {

    static int findIndex(int arr[], int element){
        int index =0;
     for(int  i=1; i<arr.length; i++){
         index++;
         if(arr[i] == element){
             break;
         }
     }
     return arr.length>1 ? index : 1;
    }

    static int findIndex_1(int arr[], int element){
        List<Integer> listElements = new ArrayList<Integer>();
        for(int x: arr){
            listElements.add(x);
        }
        return listElements.indexOf(element);
    }

    public static int findIndex_2(int arr[], int t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static int findIndex_3(int arr[], int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst() // first occurrence
                .orElse(-1); // No element found
    }
    public static void main(String[] args) {
    int a[] = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
    int k = 3;
    System.out.println(findIndex(a,k));

    System.out.println(findIndex_1(a,k));
    System.out.println(findIndex_2(a,k));
    System.out.println(findIndex_3(a,k));;
    }
}
