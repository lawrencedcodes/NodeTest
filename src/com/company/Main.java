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

        node2.setValue(5000);
        System.out.println("Node2 now has a value of "+node2.getValue());

        

    }
}
