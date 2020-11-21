package com.company;

public class Main {

    public static void main (String[] args) {
        ILinkedList<String> friends = new LinkedList<String>();
        friends.initializeList("Hannah", 22);
        friends.append("Emma", 23);
        INode<String> theNode = friends.getHead();
        while (theNode != null) {
            System.out.println(theNode);
            theNode = theNode.getNext();
        }
    }
        /*INode<String> nodeFound = friends.findNode(23);
        System.out.println(nodeFound);
        friends.removeNode(22);
        theNode = friends.getHead();
        while(theNode != null){
            System.out.println(theNode);
            theNode = theNode.getNext();
        }
    }*/

}