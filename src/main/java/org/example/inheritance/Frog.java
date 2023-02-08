package org.example.inheritance;

public class Frog extends Amphibian {
    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void breathe() {

    }

    public void breathe(String message) {
        System.out.println(message);
    }

    @Override
    public String walk() {
        return super.walk();
    }
}
