package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
