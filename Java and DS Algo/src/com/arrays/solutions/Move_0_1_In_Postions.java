package com.arrays.solutions;

import java.util.ArrayList;
import java.util.List;

public class Move_0_1_In_Postions {

    static void moveElementsPositions(int arr[]){
        List<Integer> list= new ArrayList<Integer>();

        int index=0;
        for(int t: arr){
            if(t == 2){
                list.add(t);
            }else if(t==1){
                list.add(index,t);
                index+=1;
            }else if (t == 0) {
                list.add(0, t);
                index += 1;
            } else {
                System.out.println(" wrong value - Aborting ");
                continue;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
     int a[] = {1,0,2,2,0,0,1,2};
        moveElementsPositions(a);
    }
}
