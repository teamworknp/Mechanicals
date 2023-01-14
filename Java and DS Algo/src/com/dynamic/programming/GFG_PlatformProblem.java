package com.dynamic.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

public class GFG_PlatformProblem {

    private static class TrainSchedule {
        int arrivalTime, deptTime;
        TrainSchedule(int arrivalTime, int deptTime)
        {
            this.arrivalTime = arrivalTime;
            this.deptTime = deptTime;
        }
        public String toString()
        {
            return "(" + this.arrivalTime + ","
                    + this.deptTime + ")";
        }
    }
    public static int countPlatforms(int[] arr, int[] dep)
    {
        TrainSchedule[] trains
                = new TrainSchedule[arr.length];
        // Store the arrival and departure time
        for (int i = 0; i < arr.length; i++) {
            trains[i] = new TrainSchedule(arr[i], dep[i]);
        }
        // Sort trains based on arrival time
        Comparator<TrainSchedule> trainScheduleComparator = new Comparator<TrainSchedule>() {
            @Override
            public int compare(TrainSchedule o1, TrainSchedule o2) {
                return o1.arrivalTime - o2.arrivalTime;
            }
        };
        Arrays.sort(trains,trainScheduleComparator );
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(trains[0].deptTime);
        System.out.println("priority queue: " + pq);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            TrainSchedule curr = trains[i];
            // Check if arrival time of current train
            // is less than or equals to departure time
            // of previous train
            if (curr.arrivalTime <= pq.peek()) {
                System.out.println("curr.arrivalTime " +curr.arrivalTime);
                count++;
            }
            else {
                pq.poll();
            }
            pq.add(curr.deptTime);
        }
        // return the count of number of platforms required
        return count;
    }

     static int findPlatform(int[] arrival, int [] departure, int n){
         int platform = 1, minPlatform = 1;
         int i = 1, j = 0;

         while (i < n && j < n) {
             if (arrival[i] < departure[j]) {
                 platform++;     //platform added
                 i++;
                 if (platform > minPlatform)    //if platform value is greater, update minPlatform
                     minPlatform = platform;
             } else {
                 platform--;      //delete platform
                 j++;
             }
         }
         return minPlatform;
    }

    static int findPlatform1(int[] arrival, int [] departure, int n){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform = 1, result =1;
        int i=1, j=0;
        while(i < n && j < n){
            if(arrival[i] <= departure[j]){
                platform++;
                i++;
            } else if(arrival[i] > departure[j]){
                platform--;
                j++;
            }
            if(platform > result ){
                result = platform;
            }
        }
        return result;
    }
    public static void main(String[] args) {
         int[] arrival =  {800, 815, 900, 1000, 1200,810,800};
         int[] departure = {815,820,910,1015,1220,812,811};

        int [] start = {0,2,5,6};

        int [] end ={4,3,7,8};


         if(arrival.length == departure.length){
             System.out.println(countPlatforms(start,end));
         }else{
             System.out.println("either one of the train timings are not mentiooned");
         }
    }
}
