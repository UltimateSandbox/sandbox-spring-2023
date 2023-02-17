package org.example.generics;

public class Box<T extends Number> {

    private T value;

    public Box() {
        value = null;
    }

    public Box(T value) {
        this.value = value;
    }

    public T getContents() {
        return value;
    }

    public void setContents(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Box {");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
