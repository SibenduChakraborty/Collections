package com.collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    public static void main(String[] args) {
       Queue<Integer> pq= new PriorityQueue<>();
       //Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());--> converts into max heap
       pq.offer(2);
       pq.offer(3);
       pq.offer(1);
        System.out.println(pq);
    }
}
