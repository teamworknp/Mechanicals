package com.arrays.solutions;

public class Sentinel_Search {

    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    static void sentinelSearch(int arr[], int n, int key)
    {

        // Last element of the array
        int last = arr[n - 1];

        // Element to be searched is
        // placed at the last index
        arr[n - 1] = key;
        int i = 0;

        while (arr[i] != key)
            i++;

        // Put the last element back
        arr[n - 1] = last;

        if ((i < n - 1) || (arr[n - 1] == key))
            System.out.println(key + " is present at index "
                    + i);
        else
            System.out.println("Element Not found");
    }

    public static void main(String[] args) {
        int arr[]
                = { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
        int n = arr.length;
        int key = 180;

        //sentinelSearch(arr, n, key);

        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);

    }
}
