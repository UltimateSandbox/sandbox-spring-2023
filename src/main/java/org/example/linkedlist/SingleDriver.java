package org.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("first");
        list.addFirst("second");
        list.addFirst("third");
        list.addFirst("fourth");
        list.addFirst("fifth");

        list.addLast("sixth");
        list.addLast("seventh");
        list.addLast("eighth");

        System.out.println(list);

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }
}
