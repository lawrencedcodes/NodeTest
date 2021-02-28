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
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.getNext() !=null) {
                p = p.getNext();
                p.setNext(newNode);
            }
        }
    }
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.getNext()==null) {
            head = null;
            return;
        }
        Node p = head;
        while (p.getNext().getNext() != null) {
            p = p.getNext();
            p.setNext(null);
        }
    }

    public void deleteAll() {
        head = null;
    }
    
    public void deleteFirst() {
        if (head!=null) {
            head = head.getNext();
        }
    }

    public void traverse () {
        Node pointer = head;
        while (pointer!=null) {
            System.out.print(pointer+"\n");
            pointer = pointer.getNext();
        }
    }

}
