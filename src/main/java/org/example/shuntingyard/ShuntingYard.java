package org.example.shuntingyard;

import java.util.*;
public class ShuntingYard {

    private static String REGEX_OPERATOR = "^[+\\-*\\/]$";

    public static String postFix(String inFix) {

        // preprocessing
        String[] inputChars = inFix.split("");
        Queue<String> input = new LinkedList<>();
        Queue<String> output = new LinkedList<>();
        Stack<String> operatorStack = new Stack<>();

        // load input queue
        Arrays.asList(inputChars).stream()
                .forEach(c -> input.offer(c));

        while(!input.isEmpty()) {

            // read a token
            String token = input.poll();

            if(isNumeric(token)) {
                output.offer(token);
                continue;
            }

            if(isFunction(token)) {
                operatorStack.push(token);
                continue;
            }

            if(isOperator(token)) {
                while(!operatorStack.isEmpty() &&
                operatorStack.peek().matches(REGEX_OPERATOR) &&
                !operatorStack.peek().matches("\\(")) {

                }
            }

            if(isLeftParenthesis(token)) {

            }

            if(isRightParenthesis(token)) {
                while() {

                }
            }

        }

        while() {

        }

        String postFix = "";
        return postFix;
    }

    private static boolean isRightParenthesis(String token) {
        return false;
    }

    private static boolean isLeftParenthesis(String token) {
        return false;
    }

    private static boolean isOperator(String token) {
        return false;
    }

    private static boolean isFunction(String token) {
        // TODO implement this
        return false;
    }

    private static boolean isNumeric(String token) {
        return token.matches("^[0-9]$");
    }
}
