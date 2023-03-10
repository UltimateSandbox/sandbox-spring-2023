package org.example.queue;

public class Driver {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayListQueue<>();

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");

        System.out.println(queue);
    }
}
