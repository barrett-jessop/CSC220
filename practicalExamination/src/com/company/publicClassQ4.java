package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class publicClassQ4 implements iPublicClassQ4 {
    public static void initializeQueue(){
        Queue<String> names = new LinkedList<String>();
        names.add("Bob");
        names.add("Lori");
        names.add("Pedro");
        names.add("Tigran");
        names.add("Milton");
        names.add("Van");
        names.add("Kayla");
        names.add("Bryce");
        names.add("Carli");
        names.add("Mason");
        System.out.println("\nOriginal Queue: " + names);
    }


    public void iterateQueue(Queue<String> names){
        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void reverseQueue() {
    }

    @Override
    public void reverseQueue(Queue<String> names) {
        while(!names.isEmpty()){
            names.add(names.peek());
            names.remove();
        }
        while(!names.isEmpty()){
            names.add(names.peek());
            names.poll();
        }
        System.out.println("Reversed Queue: " + names);
    }


}
