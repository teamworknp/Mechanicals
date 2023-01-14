package com.arrays.solutions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMissingAndRepeatingElements {

    static void findMissingAndRepeatingElements(int arr[]){

        Map<Integer,Boolean> hm = new HashMap<Integer, Boolean>();

        for(int x: arr){
           if(hm.get(x) == null){
              hm.put(x, true);
           }else{
               System.out.println("value is repeating: "+ x);
           }
        }
        System.out.println(hm);
        for(int i=10;i<15;i++){
            if(hm.get(i) == null){
                System.out.println("Missing element" +i);
            }
        }




    }
    public static void main(String[] args) {
        int arr[] = {10,10,12,11,11,15};
        findMissingAndRepeatingElements(arr);
    }
}
