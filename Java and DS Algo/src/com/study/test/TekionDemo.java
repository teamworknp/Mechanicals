package com.study.test;

public class TekionDemo {

    static int findMinScreens(int start[], int end[], int length){

        int i=1, j=0;
        int screen =1;
        int result =1;

        while(i< length && j< length){
            if(start[i]<=end[j]){
                screen++;
                i++;
            }
            if(screen > result){
                result = screen;
            }else{
                j++;
                screen--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] start = {0,2,5,6};

        int [] end ={4,3,7,8};

        System.out.println(findMinScreens(start, end,start.length));

    }
}
