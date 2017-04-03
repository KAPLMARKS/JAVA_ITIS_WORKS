package com.company;

/**
 * Created by acer on 03.04.2017.
 */
public class Queue {
    private Node head = null;

    private Node tail = null;

    public int size;



    public void push(int node) {

        Node nod = new Node(5);
        nod.setNode(node);
        if (head == null) {
            head = nod;
        } else {
            tail.setNext(nod);
        }
        tail = nod;
        size++;
    }

    public int pull(int i) {
        if (size == 0) {
            return 0 ;
        }
        int nod = head.getNode();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return nod;
    }

    public int get(int index) {
        if(size == 0 || index >= size || index < 0) {
            return 0;
        }
        Node current = head;
        int pos = 0;
        while(pos < index) {
            current = current.getNext();
            pos++;
        }
        int nod = current.getNode();
        return nod;
    }

    public int size() {
        return size;
    }
}
