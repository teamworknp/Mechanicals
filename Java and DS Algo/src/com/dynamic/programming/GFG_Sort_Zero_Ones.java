package com.dynamic.programming;

import java.util.*;

public class GFG_Sort_Zero_Ones {
    public static void main(String[] args) {
        int[] a = {0,1,2,0,1,2,0};

        int counter_0 = 0;
        int counter_1 =0;
        int counter_2 =0;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int val:  a){
            hm.compute(val, (k,v)-> (v==null) ? 1: v+1);
        }
        System.out.println("values in map is"+ hm);
        Iterator<Map.Entry<Integer,Integer>> iter = hm.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer, Integer> val = iter.next();
            if(val.getKey() ==0){
            counter_0 = val.getValue();
            }
            if(val.getKey() ==1){
                counter_1 = val.getValue();
            }
            if(val.getKey() ==2){
                counter_2 = val.getValue();
            }
        }


            for(int i=0;i<counter_0;i++){
                a[i] = 0;
                //System.out.println(a[i]);
            }

            for(int i=counter_0;i<(counter_0 + counter_1);i++){
                a[i] = 1;
               // System.out.println(a[i]);
            }

            for(int i=(counter_0 + counter_1);i<a.length;i++){
                a[i] = 2;
               // System.out.println(a[i]);
            }

            for(int i=0; i<a.length;i++){
                System.out.println(" "+a[i] );
            }

    }
}
