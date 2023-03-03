package org.example.comparable;

import java.util.Objects;

public class Orange implements Comparable<Orange> {

    private Size size;

    public Orange() {
    }

    public Orange(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return size == orange.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Orange{");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Orange that) {
        if (this.size.ordinal() < that.size.ordinal()) {
            return -1;
        } else if (this.size.ordinal() > that.size.ordinal()) {
            return 1;
        } else {
            return 0;
        }
    }
}
