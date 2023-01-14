package com.dynamic.programming;

public class GFG_MissingNumber {

    static void printMissing(
            int arr[], int low,
            int high)
    {
        // Create boolean array of
        // size high-low+1, each index i
        // representing whether (i+low)th
        // element found or not.
        boolean[] points_of_range = new boolean
                [high - low + 1];

        for (int i = 0; i < arr.length; i++) {
            // if ith element of arr is in
            // range low to high then mark
            // corresponding index as true in array
            if (low <= arr[i] && arr[i] <= high)
                points_of_range[arr[i] - low] = true;
        }

        // Traverse through the range and print all
        // elements whose value is false
        for (int x = 0; x <= high - low; x++) {
            if (points_of_range[x] == false)
                System.out.print((low + x) + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4 };
        int low = 1, high = 10;
        printMissing(arr, low, high);
    }
}
