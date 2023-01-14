package com.arrays.solutions;

import java.util.HashSet;
import java.util.Set;

/*Find missing elements of a range

Input: arr[] = {10, 12, 11, 15},
        low = 10, high = 15
        Output: 13, 14

        Input: arr[] = {1, 14, 11, 51, 15},
        low = 50, high = 55
        Output: 50, 52, 53, 54 55

 */
public class FindMissingElementsArrayRange {

    static void printMissingArray(int[] arr, int low, int high) {

     Set<Integer> hs = new HashSet<Integer>();

     for(int x: arr){
         hs.add(x);
     }
     System.out.println(hs);
     for(int i=low;i< high;i++){
         if(!hs.contains(i)){
             System.out.println("Missing element" + i);
         }
     }
    }

    static void printMissingelements_1(int[] arr, int low, int high){

        boolean element_of_range[] = new boolean[high -low + 1];

        for(int i= 0; i< arr.length;i++){
            if(low < arr[i] && arr[i]<high){
                element_of_range[arr[i]- low] = true;
            }
        }

        for(int x=0;x<high -low;x++){
            if(element_of_range[x] == false){
                System.out.println((low +x));
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 11, 15};
        int low = 9;
        int high =16;
       // printMissingArray(arr,low,high);
        printMissingelements_1(arr,low,high);
    }
}
