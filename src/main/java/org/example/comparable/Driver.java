package org.example.comparable;

import java.util.*;

public class Driver {

    public static void main(String[] args) {

        Apple apple1 = new Apple(Size.LARGE, Color.GREEN, "Granny Smith");
        Apple apple2 = new Apple(Size.MEDIUM, Color.RED, "Fuji");
        Apple apple3 = new Apple(Size.LARGE, Color.RED, "Gala");
        Apple apple4 = new Apple(Size.MEDIUM, Color.YELLOW, "Golden Delicious");
        Apple apple5 = new Apple(Size.SMALL, Color.RED, "McIntosh");
        Apple apple6 = new Apple(Size.XLARGE, Color.GREEN, "McIntosh");
        Apple apple7 = new Apple(Size.SMALL, Color.GREEN, "McIntosh");

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple6);
        apples.add(apple5);
        apples.add(apple7);

        apples.forEach(System.out::println);
        Collections.sort(apples);
        apples.forEach(System.out::println);

        Orange orange1 = new Orange(Size.XLARGE);
        Orange orange2 = new Orange(Size.SMALL);
        Orange orange3 = new Orange(Size.LARGE);
        Orange orange4 = new Orange(Size.MEDIUM);

        List<Orange> oranges = new ArrayList<>();

        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);
        oranges.add(orange4);

        oranges.forEach(System.out::println);
        Collections.sort(oranges);
        oranges.forEach(System.out::println);

    }
}
