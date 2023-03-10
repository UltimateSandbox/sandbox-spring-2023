package org.example.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    @Override
    public T peek() {
        return this.stack.get(0);
    }

    @Override
    public T pop() {

        T value = null;
        try {
            value = this.stack.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Operation not possible: Stack is empty.");
        }
        return value;
    }

    @Override
    public void push(T item) {
        this.stack.add(0, item);
    }

    @Override
    public int search(T t) {
        return this.stack.indexOf(this.stack.indexOf(t));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArrayListStack {");
        sb.append("stack=").append(stack);
        sb.append('}');
        return sb.toString();
    }
}
