package com.company;

public class StringNode {
    public StringNode next;
    public String value;

    public StringNode(String word) {
        value = word;
        next = null;
    }

    //getters and setters
    public StringNode getNext() {
        return next;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node string is "+ value;
    }
}
