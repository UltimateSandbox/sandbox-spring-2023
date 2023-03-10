package org.example.shuntingyard;

import java.security.InvalidParameterException;
import java.util.*;
import java.util.stream.Collectors;

public class ShuntingYard {

    private static String REGEX_OPERATOR = "^[+\\-*\\/]$";
    private static String REGEX_LEFT_PARENTHESIS = "\\(";
    private static String REGEX_NUMERIC = "^[0-9]$";

    public static String postFix(String inFix) {

        String[] inputChars = inFix.split("");
        Queue<String> input = new LinkedList<>();
        Queue<String> output = new LinkedList<>();
        Stack<String> operatorStack = new Stack<>();

        Arrays.asList(inputChars).stream()
                .forEach(c -> input.offer(c));

        while (!input.isEmpty()) {

            String token = input.poll();

            if (isNumeric(token)) {
                output.offer(token);
                continue;
            }

            if (isFunction(token)) {
                operatorStack.push(token);
                continue;
            }

            if (isOperator(token)) {

                while(!operatorStack.isEmpty() &&
                        operatorStack.peek().matches(REGEX_OPERATOR) &&
                        !operatorStack.peek().matches(REGEX_LEFT_PARENTHESIS)) {
                    // TODO implement operator precedence
                    output.offer(operatorStack.pop());
                }
                operatorStack.push(token);
                continue;
            }

            if (isLeftParenthesis(token)) {

                operatorStack.push(token);
                continue;
            }

            if (isRightParenthesis(token)) {

                while(!operatorStack.isEmpty() &&
                        !operatorStack.peek().matches(REGEX_LEFT_PARENTHESIS)) {
                    output.offer(operatorStack.pop());
                }

                if(operatorStack.peek().matches(REGEX_LEFT_PARENTHESIS)) {
                    operatorStack.pop();
                    continue;
                }

                if(isFunction(operatorStack.peek())) {
                    output.offer(operatorStack.pop());
                }

            }


        }

        while (!operatorStack.isEmpty()) {
            if ("(".compareTo(operatorStack.peek()) != 0) {
                output.offer(operatorStack.pop());
            } else {
                throw new InvalidParameterException("Input mismatch.");
            }
        }

        String postFix = output.stream()
                .collect(Collectors.joining());
        return postFix;
    }

    private static boolean isRightParenthesis(String token) {
        return ")".compareTo(token) == 0;
    }

    private static boolean isLeftParenthesis(String token) {
        return "(".compareTo(token) == 0;
    }

    private static boolean isOperator(String token) {
        return token.matches(REGEX_OPERATOR);
    }

    private static boolean isFunction(String token) {
        // TODO implement
        return false;
    }

    private static boolean isNumeric(String token) {
        return token.matches(REGEX_NUMERIC);
    }

}
