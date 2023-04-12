package org.example.searching;

import java.util.Arrays;

public class SearchUtility {

    public static void main(String[] args) {

        int[] intArray = {2, 4, 6, 5, 3, 1, -2, -1, 0};
        Integer[] integerArray = Arrays.stream(intArray)
                .boxed()
                .toArray(Integer[]::new);
        int[] sortedIntArray = Arrays.stream(intArray)
                .sorted()
                .toArray();

        System.out.println(SearchUtility.linearSearch(intArray, 1));
        System.out.println(SearchUtility.linearSearch(intArray, 10));

        System.out.println(SearchUtility.linearSearch(integerArray, 1));
        System.out.println(SearchUtility.linearSearch(integerArray, 10));

        System.out.println(SearchUtility.binarySearchIterative(sortedIntArray, 1));
        System.out.println(SearchUtility.binarySearchIterative(sortedIntArray, 10));

        System.out.println(SearchUtility.binarySearchRecursive(sortedIntArray, 1));
        System.out.println(SearchUtility.binarySearchRecursive(sortedIntArray, 10));
    }

    public static int linearSearch(int[] array, int targetValue) {

        int found = Integer.MIN_VALUE;
        for (int i : array) {
            if (i == targetValue) {
                found = targetValue;
                break;
            }
        }
        return found;
    }

    public static <T extends Comparable<T>> T linearSearch(T[] array, T targetValue) {

        T found = null;
        for (T t : array) {

            if (t.compareTo(targetValue) == 0) {
                found = targetValue;
                break;
            }
        }
        return found;
    }

    public static int binarySearchIterative(int[] array, int targetValue) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int mid = min + (max - min) / 2;

            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                // if target is greater, ignore left half of array
                min = mid + 1;
            } else if (array[mid] > targetValue) {
                // if target is smaller, ignore right half of array
                max = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, final int targetValue) {
        return binarySearchRecursive(array, 0, (array.length - 1), targetValue);
    }

    private static int binarySearchRecursive(int[] arr, int minIndex, int maxIndex, final int targetValue) {

        if (maxIndex >= minIndex) {

            int mid = minIndex + (maxIndex - minIndex) / 2;

            if (arr[mid] == targetValue) {
                return mid;
            } else if (arr[mid] < targetValue) {
                // if target is greater, ignore left half of array
                return binarySearchRecursive(arr, mid + 1, maxIndex, targetValue);
            } else if (arr[mid] > targetValue) {
                // if target is smaller, ignore right half of array
                return binarySearchRecursive(arr, minIndex, mid - 1, targetValue);
            }
        }
        return -1;
    }

}
