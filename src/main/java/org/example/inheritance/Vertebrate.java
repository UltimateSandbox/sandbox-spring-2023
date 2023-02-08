package org.example.inheritance;

public abstract class Vertebrate implements Animal {

    @Override
    public String toString() {
        return getClass().getSimpleName() + "|I'm a vertebrate.";
    }

}
