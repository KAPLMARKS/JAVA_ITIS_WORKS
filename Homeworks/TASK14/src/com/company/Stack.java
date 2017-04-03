package com.company;

/**
 * Created by acer on 03.04.2017.
 */
    public class Stack {private Node head;
        private int count;

        public Stack() {
            head = null;
            count = 0;
        }

        public void push(Human value) {

            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
            count++;
        }

        public Human pop() {
            Human result = head.getValue();
            head = head.getNext();
            count--;
            return result;
        }

        public Human peek() {
            return head.getValue();
        }

        public int getCount() {
            return count;
        }

    }
