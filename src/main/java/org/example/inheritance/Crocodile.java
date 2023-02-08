package org.example.inheritance;

public class Crocodile extends Reptile {
    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Crocodile says what?!");
        return sb.toString();
    }
}
