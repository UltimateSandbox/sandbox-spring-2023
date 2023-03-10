package org.example.queue;

public interface Queue<E> {

    boolean offer(E e);
    E poll();
    E peek();
    boolean isEmpty();
}
