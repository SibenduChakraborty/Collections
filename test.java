package com.collections;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList();
        list.add('a');
        list.add('s');
        list.add('t');
        list.add('r');
        list.add('o');
        list.remove(2);
        System.out.println(list);
        String s="";
        System.out.println(s.concat(String.valueOf(list.get(1))));
        System.out.println(s.concat(String.valueOf(list.get(2))+String.valueOf(list.get(1))));

        System.out.println(s);

    }
}
