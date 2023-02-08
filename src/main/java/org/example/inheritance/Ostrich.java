package org.example.inheritance;

public class Ostrich extends Bird {

    public Ostrich() {
        this.canFly = false;
    }

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
}
