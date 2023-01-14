package com.arrays.solutions;

/*
* Array = {1 , 2 , 3 , 4 , 5}
  Target = 6
*
* */
public class Find_Two_Sum_Array {

    static int[] targetSum(int []a , int target)
    {
        int left = 0 , right = a.length - 1 , tempSum;
        while(left < right)
        {
            tempSum = a[left] + a[right];
            if(tempSum == target)
                return new int[]{left + 1 , right + 1};
            if(tempSum > target)
                right--;
            else
                left++;
        }
        return new int[]{-1 , -1};
    }

    public static void main(String[] args) {

     int[] array = {1 , 2 , 3 , 4 , 5};
     int target = 3;
     //targetSum(array,target);
     for(int x : targetSum(array , target))
         System.out.print(x + " ");
    }
}
