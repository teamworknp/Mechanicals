package com.dynamic.programming;

import java.util.*;

public class GFG_LargestElement {

    public static void secondLargest(int n, List<Integer> vec, int kthPosition)
    {

        // size of array should be greater than 1
        if (n < 2) {
            System.out.println("Invalid Input");
            return;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("vec.get(i)"+vec.get(i));
            count.put(vec.get(i), count.getOrDefault(vec.get(i), 0) + 1);
            System.out.println("count is" + count);
        }
        System.out.println("Frequency wise count is" + count);

        // Checking if count size is equal to 1 it
        // means only largest element exist there is no second
        // largest element
        if (count.size() == 1) {
            System.out.println("No Second largest element exist");
            return;
        }
        int size = 1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (size == kthPosition ) {
                System.out.println("The second largest element is: " + entry.getKey());
                break;
            }
            size++;
        }
        System.out.println();
    }

    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + second);
    }

    public static void main(String[] args) {
        List<Integer> vec = new ArrayList<>();
        vec.add(12);
        vec.add(34);
        vec.add(1);
        vec.add(10);
        vec.add(35);
        vec.add(1);
       // System.out.println("icr "+ vec);
       // System.out.println("icr post sort "+ vec.stream().distinct().sorted(Collections.reverseOrder()).findAny());
       // secondLargest(vec.size(), vec,3);
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
