package com.collections;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push("sibendu");
        st.push("is a good boy");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
