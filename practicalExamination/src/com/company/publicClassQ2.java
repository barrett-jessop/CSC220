package com.company;

import java.util.Stack;

public class publicClassQ2 {

    static void deleteMiddle(Stack<Integer> ages, int a, int current){
        if(ages.empty() || current == a){
            return;
        }
        int x = ages.pop();

        deleteMiddle(ages, a, current+1);

        if(current != a/2){
            ages.push(x);
        }
    }
}
