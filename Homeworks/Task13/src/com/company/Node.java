package com.company;

/**
 * Created by acer on 03.04.2017.
 */
public class Node {
        private int value;

        private Node next;
        private int node;

        public Node(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNode(int node) {
            this.node = node;
        }

        public int getNode() {
            return node;
        }
}
