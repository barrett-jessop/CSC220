package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static com.company.publicClassQ1.reverseQueue;
import static com.company.publicClassQ2.deleteMiddle;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> ages = new Stack<Integer>();
        ages.push(11);
        ages.push(10);
        ages.push(9);
        ages.push(8);
        ages.push(7);
        ages.push(6);
        ages.push(5);
        ages.push(4);
        ages.push(3);
        ages.push(2);
        ages.push(1);
        System.out.print("Original Stack: " + ages + "\n");

        deleteMiddle(ages, ages.size(), 0);

        while(!ages.empty()){
            int z = ages.pop();
            System.out.print(z + " ");
        }

        Queue<String> names = new LinkedList<String>();
        names.add("Peaches");
        names.add("Billy");
        names.add("Joey");
        names.add("Ken");
        names.add("Brooke");
        names.add("Porter");
        names.add("Bridger");
        names.add("Jordan");
        names.add("Russ");
        names.add("Kim");
        System.out.print("\nOriginal Queue: " + names);

        reverseQueue();
        System.out.print("\nReversed Queue: " + names);



        iPublicClassQ4 Queue = new publicClassQ4();
        publicClassQ4.initializeQueue();
        publicClassQ4.reverseQueue();

    }

}
