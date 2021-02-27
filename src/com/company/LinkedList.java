package com.company;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insertFirst(int data) {
        Node node0 = new Node(data);
        node0.setNext(head);
        head =node0;
    }

    public void traverse () {
        Node pointer = head;
        while (pointer!=null) {
            System.out.print(pointer+"\n");
            pointer = pointer.getNext();
        }
    }

}
