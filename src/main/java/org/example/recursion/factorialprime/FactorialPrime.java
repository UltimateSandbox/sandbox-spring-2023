package org.example.recursion.factorialprime;

import java.util.ArrayList;
import java.util.List;

public class FactorialPrime {

    public static void main(String[] args) {

        List<Long> minus = new ArrayList<>();
        List<Long> plus = new ArrayList<>();

        for (int x = 0; x < 20; x++) {

            long fact = factorial(x);

            if (isPrime(fact - 1)) {
                minus.add(fact - 1);
                System.out.println("!" + x + "-1 is prime [" + (fact - 1) + "]");
            }
        }
        System.out.println();
        for (int x = 0; x < 20; x++) {
            long fact = factorial(x);
            if (isPrime(fact + 1)) {
                plus.add(fact + 1);
                System.out.println("!" + x + "+1 is prime [" + (fact + 1) + "]");
            }
        }
    }

    private static boolean isPrime(long n) {

        boolean prime = true;

        if (n == 0 || n == 1) {
            prime = false;
        } else {
            double m = Math.ceil(Math.sqrt(n));
            for (int x = 2; x <= m; x++) {
                if (n % x == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    private static long factorial(int x) {

        // base case
        if (x == 0) {
            return 1;
        }

        return x * factorial(x - 1);
    }

}
