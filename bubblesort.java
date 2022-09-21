package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList();
        Scanner sc= new Scanner(System.in);
        for (int k=0;k<5;k++){
            l.add(k,sc.nextInt());
        }
        for(int j=0;j<5;j++) {
            for (int i = 0; i < 4-j; i++) {
                if (l.get(i) > l.get(i + 1)) {
                    int temp = l.get(i + 1);
                    l.add(i + 1, l.get(i));
                    l.add(i, temp);
                    l.remove(i + 2);
                    l.remove(i + 2);
                }
            }
        }
        System.out.println(l);
    }
}
