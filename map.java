package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
//        Map<String, Integer> num= new HashMap<>();
        Map<String, Integer> num= new TreeMap<>();//sorted on key
        num.put("two", 2);
        num.put("one", 1);
        System.out.println(num);
        for(Map.Entry<String,Integer> p: num.entrySet()){
            System.out.println(p.getKey()+" " +p.getValue());
        }
        System.out.println(num.containsKey("two"));
    }
}
