package org.example.bigo;

import java.util.ArrayList;
import java.util.List;

public class BigO {

    public static void main(String[] args) {
        // 6*x^4 - 2x^3 + 5
        // O(x^4) x to the 4th time

        // 100890237
        // 100000000

        // 600000000000000000000010000000000000000000000
        // 600000000000000000000000000000000000000000000


        // x^2 + 2*x +5
        // O(x^2) x squared time

        // 5
        // O(1) constant time

        // x + 2
        // O(x) linear time

        // As n->infinity, what does the performance do of our algorithm?
        // O(1)
        // HashMaps
        int[] arr = new int[2000000];
        // O(n) * (O(1) + O(1) + O(1)) = O(n) product property
        for(int n = 0; n < arr.length - 1; n++) { // O(n)
            System.out.println(arr[n]); // O(1)
            // O(1)
            // O(1)
        }

        // O(log n)
        // navigation from root to leaf in tree

        // O(n)
        int sum = 0;
        // O(n) * O(n) = O(n^2)
        for(int n = 0; n < arr.length -1; n++) { // O(n)
            sum += arr[n]; // O(n)
        }

        // O(n log n)
        // navigation from root to each node in tree

        // O(n^2)
        // O(n) * ( O(n) + (O(n) * O(n)) )
        // O(n) * (O(n) + O(n^2))
        // O(n) * (O(n^2) + O(n))
        // O(n^3)
        for(int x = 0; x <= 10; x++) { // O(n)

            // O(n)

            for(int y = 0; y<=10; y++) { // O(n)

                // O(n)
            }
        }


        // O(n^3)
        // triple nested loops

        // O(2 ^n)
        // recursion

        // O(M*N)

        List<String> list = new ArrayList<>();

    }
}
