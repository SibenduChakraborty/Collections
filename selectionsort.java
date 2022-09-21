package com.collections;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class selectionsort {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList();
        ArrayDeque<Integer> res= new ArrayDeque<>();
        Scanner sc= new Scanner(System.in);
        for (int k=0;k<5;k++){
            l.add(k,sc.nextInt());
        }
        for(int j=0;j<5;j++) {
                int max = Collections.max(l);
                res.addLast(max);
                l.remove(l.indexOf(max));
        }
        System.out.println(res);
    }
}
