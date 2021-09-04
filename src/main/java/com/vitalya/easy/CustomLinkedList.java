package com.vitalya.easy;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public int get(int index) {
        if (head == null) return -1;

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode != null ? currentNode.val : -1;
    }

    public void addAtHead(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            head = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void addAtIndex(int index, int value) {
        if (index > size) return;

        if (index == 0) {
            addAtHead(value);
            return;
        }
        if (index == size) {
            addAtTail(value);
            return;
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        Node newNode = new Node(value);
        newNode.next = currentNode;
        if (currentNode != null){
            newNode.prev = currentNode.prev;
            currentNode.prev.next = newNode;
            currentNode.prev = newNode;
        }

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (head == null) return;

        if (index == 0) {
            head = head.next;

            if (head != null)
                head.prev = null;

            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;

            size--;
            return;
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        size--;
    }

    public int size() {
        return size;
    }

    private static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int value) {
            this.val = value;
        }
    }
}
