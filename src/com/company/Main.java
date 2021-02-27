package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create 4 new nodes
	    Node node0 = new Node(223);
        Node node1 = new Node(334);
        Node node2 = new Node(50);
        Node node3 = new Node(400);
        System.out.println("The three new nodes are "+node1 +" "+node2+" "+node3);

        //Reset value of node 2
        node2.setValue(5000);
        System.out.println("Node2 now has a value of "+node2.getValue());

        //Set value of next NodeS
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println("The list is now "+node0+" "+node0.getNext()+" "+node1.getNext()+" "+node2.getNext()+"\n");

        //Get the pointer going
        Node p = node0;
        System.out.print("Node0 is "+node0+" ");
        p = p.getNext();
        System.out.println("Calling p.getNext, Node1 is "+ p);
        p = p.getNext();
        System.out.print("Calling p.getNext again, Node2 is "+p+" ");
        p = p.getNext();
        System.out.println("Calling p.getNext again, Node 3 is "+p+"\n");

        //loop structure for easier iteration
        p = node0;
        int count = 0;
        if (p==null) {
            System.out.println("There are no nodes.");
        } else {
            while (p != null) {
                count += 1;
                System.out.println(" " + p);
                p = p.getNext();
            }
        }
        System.out.println("That's the end of the linked list.");
        System.out.println("The total nodes are "+count + ".\n");

        //Let's look for a number
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number to find: ");
        int input = in.nextInt();

        boolean found = false;
        while (p!= null && !found) {
            if (input == p.getValue()) {
                found = true;
                System.out.println("We found your number!");
                p = p.getNext();
            };

        }

        LinkedList myList = new LinkedList();
        myList.insertFirst(5);
        myList.insertFirst(3);
        myList.insertFirst(99);
        myList.traverse();

    }
}
