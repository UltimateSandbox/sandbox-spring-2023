package org.example.comparable;

import java.util.Objects;

public class Apple implements Comparable<Apple> {

    private Size size;
    private Color color;
    private String type;

    // no-arg
    public Apple() {
    }

    public Apple(Size size, Color color, String type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return size == apple.size && Objects.equals(color, apple.color) && Objects.equals(type, apple.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, type);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apple {");
        sb.append("size=").append(size);
        sb.append(", color=").append(color);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Apple that) {

        if (this.type.compareTo(that.getType()) < 0) {
            return -1;
        } else if (this.type.compareTo(that.getType()) > 0) {
            return 1;
        } else {

            if (this.color.ordinal() < that.color.ordinal()) {
                return -1;
            } else if(this.color.ordinal() < that.color.ordinal()) {
                return 1;
            } else {

                if(this.size.ordinal() < that.size.ordinal()) {
                    return -1;
                } else if(this.size.ordinal() > that.size.ordinal()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
