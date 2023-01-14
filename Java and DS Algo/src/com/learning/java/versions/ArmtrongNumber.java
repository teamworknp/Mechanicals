package com.learning.java.versions;

public class ArmtrongNumber {
    // 153 = 1 * 1 *1 + 5 * 5 * 5 + 3 * 3 * 3 = 1 + 125 + 27 = 153

    public static void main(String[] args) {
    int n =1634;
    int temp = n;
    int rem =0;
    int sum=0;
    int power =0;



    while(temp>0){
        temp = temp/10;
        power++;
        System.out.println("value count" + power);
    }
    temp=n;

    while(n>0){
        rem =n%10;
        System.out.println("Reminder is "+ rem);
        sum+= (int)Math.pow(rem,power);
        n = n/10;
        System.out.println("n value is "+ n);
        System.out.println("sum is "+ sum);
    }
    if(sum == temp){
        System.out.println("Given number is Armstrong number");
    }
    else{
        System.out.println("nope");
    }
    System.out.println();
    }
}
