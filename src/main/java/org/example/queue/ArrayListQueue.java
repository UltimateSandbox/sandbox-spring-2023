package org.example.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListQueue<T> implements Queue<T> {

    private List<T> queue;

    public ArrayListQueue() {
        this.queue = new ArrayList<>() {

            @Override
            public String toString() {
                return this.stream()
                        .map(c -> c.toString())
                        .collect(Collectors.joining(", "));
            }
        };
    }

    @Override
    public boolean offer(T t) {
        return this.queue.add(t);
    }

    @Override
    public T poll() {
        return this.queue.remove(0);
    }

    @Override
    public T peek() {
        return this.queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(queue);
        return sb.toString();
    }
}
