package com.collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
       Set<Integer> set= new HashSet<>();
       // Set<Integer> set= new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(1);
        System.out.println(set.stream().sorted());
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
    }
}
