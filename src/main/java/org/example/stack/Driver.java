package org.example.stack;

public class Driver {

    public static void main(String[] args) {

        Stack<String> stack = new ArrayListStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println(stack);

        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
        stack.pop();

    }
}
