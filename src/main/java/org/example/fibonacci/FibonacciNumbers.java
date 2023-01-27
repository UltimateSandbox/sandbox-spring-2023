package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private Map<Integer, Long> dictionary = new HashMap<>();

    public static void main(String[] args) {

        FibonacciNumbers fn = new FibonacciNumbers();

        for (int x = 0; x <= 50; x++) {
            System.out.println("fib (" + x + ") = " + (fn.fib(x)));
        }
    }

    private long fib(int x) {

        if (x == 0) {
            return 0L;
        }
        if (x == 1) {
            return 1L;
        }
        return memo(x - 1) + memo(x - 2);

    }

    private long memo(int i) {

        Long value = dictionary.get(i);

        if (value != null) {
            return value;
        }

        value = fib(i);
        dictionary.put(Integer.valueOf(i), value);
        return value;
    }

}
