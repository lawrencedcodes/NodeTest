package com.company;

public class LinkedList {
    private Node hdptr;

    public LinkedList() {
        hdptr = null;
    }

    public void insFirst(int data) {
        Node node0 = new Node(data);
        node0.setNext(hdptr);
        hdptr = node0;
    }
}
