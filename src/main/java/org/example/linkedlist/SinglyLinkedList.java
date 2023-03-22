package org.example.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node node = new Node(element, head);  // #1 & #2

        if (head == null) {
            head = node; // #3
            tail = head;
        } else {
            head = node; // #3
        }
    }

    @Override
    public void addLast(E element) {

        Node node = new Node(element, null); // #1
        tail.next = node; // #2
        tail = node; // #3

    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");

        Node current = head;
        if (current != null) {
             while (current != null) {
                 joiner.add(current.element.toString());
                 current = current.next;
             }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
