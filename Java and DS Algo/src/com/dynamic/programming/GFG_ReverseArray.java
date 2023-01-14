package com.dynamic.programming;

public class GFG_ReverseArray {
    int first = Integer.MIN_VALUE;
    private static void reverse(int[] arr, int start, int end) {
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int arr[],int size){
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    }

    public static void main(String[] args) {
       int arr[] = {1, 2, 3};
        //printArray(arr,arr.length);
        reverse(arr,0,2);
        printArray(arr,arr.length);
        GFG_ReverseArray gfgReverseArray =new GFG_ReverseArray();
        System.out.println(gfgReverseArray.first);
    }



}
