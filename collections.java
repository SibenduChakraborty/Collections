package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(2);
        l.add(1,2);
        Collections.sort(l);
        l.add(0,69);
        l.add(l.size(),96);
        System.out.println(l);
        System.out.println(Collections.min(l));
        System.out.println(Collections.max(l));
        System.out.println(Collections.frequency(l,1));
    }
}
