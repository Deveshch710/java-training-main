package com.coforge.Day_06_07_26_prj;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueMain {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Display PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Peek
        System.out.println("Peek: " + pq.peek());

        // Offer
        System.out.println("Offer 10: " + pq.offer(10));

        // Poll
        System.out.println("Poll: " + pq.poll());
        System.out.println("Poll: " + pq.poll());

        // Remaining elements
        System.out.println("PriorityQueue: " + pq);

        // ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(88);
        ad.add(99);
        ad.addFirst(11);
        ad.addLast(100);

        System.out.println("ArrayDeque: " + ad);
    }
}