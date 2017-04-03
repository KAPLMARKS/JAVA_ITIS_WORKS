package com.company;

/**
 * Created by acer on 03.04.2017.
 */
public class Node { private Human value;

    private Node next;

    public Node(Human value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Human getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}