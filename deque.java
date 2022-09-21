package com.collections;
import java.util.ArrayDeque;
public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.offer(2);
        ad.offer(3);
        ad.offerFirst(1);
        ad.offerLast(4);
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        ad.pollLast();
        System.out.println(ad);
    }
}