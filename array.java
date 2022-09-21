package com.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class array {
    public static void main(String[] args) {
        ArrayList<String> students= new ArrayList<>();
        students.add("a");
        students.add("b");
        students.add("c");
        students.add(2,"d");
        students.remove(2);
        List<String> list= new ArrayList<>();
        list.add("sbendu");
        students.addAll(list);
        System.out.println(students.get(2));
        System.out.println(String.valueOf("sibendu"));
        students.remove("sbendu");
        System.out.println(students);
    }
}
