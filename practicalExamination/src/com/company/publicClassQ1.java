package com.company;

import java.util.Queue;
import java.util.Stack;
import java.lang.NullPointerException;

public class publicClassQ1 {

    static Queue<String> names;

    static void printNames(){
        while(!names.isEmpty()){
            System.out.print(names.peek() + ", ");
            names.remove();
        }
    }

    static void reverseQueue(){
        Stack<String> stackOfNames = new Stack<>();
        while(!names.isEmpty()){
            stackOfNames.add(names.peek());
            names.remove();
        }
        while (!stackOfNames.isEmpty()){
            names.add(stackOfNames.peek());
            stackOfNames.pop();
        }
    }
}
