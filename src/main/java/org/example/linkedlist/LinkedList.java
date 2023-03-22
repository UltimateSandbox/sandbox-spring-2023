package org.example.linkedlist;

public interface LinkedList<E> {

    void addFirst(E element);
    void addLast(E element);

    E pollFirst();
    E pollLast();

    E peekFirst();
    E peekLast();

    void clear();
    boolean contains(E element);
    int size();

}
