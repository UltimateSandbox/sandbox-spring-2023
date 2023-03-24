package org.example.linkedlist;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(list.size());

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("fifth"));
        System.out.println(list.contains("first"));
        System.out.println(list.contains("seventh"));
        System.out.println(list.contains("fourth"));
        System.out.println(list.contains("z"));

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        List<String> test = new ArrayList<>();
    }
}
