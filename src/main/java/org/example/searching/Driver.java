package org.example.searching;

import java.util.Scanner;

public class Driver {

    /**
     * Precision used in square root calculation
     */
    private static final float PRECISION = 0.0000001f;

    public static void main(String[] args) {

        // Get input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to find square root: ");
        float number = scan.nextFloat();

        // Calculate square root
        float sqrt = SquareRoot.calculate(number, PRECISION);

        // Display square root answer
        if (sqrt >= 0) {
            System.out.println("Square root of " + number + " is " + sqrt);
        } else {
            System.out.println("Can't calculate a negative square root.");
        }

    }
}