package com.company;

public class Main {

    public static void main(String[] args) {

	    Node node0 = new Node(223);
	    System.out.println("Node0 has a value of "+node0+ "and next node value set to "+node0.getNext());

	    //create 3 new nodes
        Node node1 = new Node(334);
        Node node2 = new Node(50);
        Node node3 = new Node(400);
        System.out.println("The three new nodes are "+node1 +" "+node2+" "+node3);

        //Reset value of node 2
        node2.setValue(5000);
        System.out.println("Node2 now has a value of "+node2.getValue());

        //Set value of next Node to node0
        node0.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println("The list is now "+node0+" "+node0.getNext()+" "+node1.getNext()+" "+node2.getNext());

        //Get the pointer going
        Node p = node0;
        System.out.println("Now our pointer p is set to "+node0);
        System.out.println("Which means the next node in the LinkedList is p.next: "+ p.getNext());
        p = p.getNext();
        System.out.println("Now the pointer is at "+p);
        p = p.getNext();
        System.out.println("And now the pointer is at "+p+" as we continuallty call p.getNext()");

    }
}
