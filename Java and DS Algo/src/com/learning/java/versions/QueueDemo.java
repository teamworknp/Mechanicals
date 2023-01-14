package com.learning.java.versions;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        Queue<Integer> queue1 = new PriorityQueue<>();
        System.out.println("Queue elements are" + queue);
     //   System.out.println(queue1.element());
        System.out.println(queue1.peek());
    }
}
