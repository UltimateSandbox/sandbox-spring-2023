package org.example.searching;

import java.util.Objects;

public class SquareRoot {

    public static float calculate(float number, float precision) {

        // no negative numbers
        if (number < 0) {
            return -1;
        }

        // Initialize datum
        Datum datum = new Datum();

        datum.min = 0.0f;
        datum.max = number;
        datum.mid = 0.0f;

        datum.number = number;
        datum.precision = precision;

        // Iterate until an in-tolerance guess is made
        while (outOfTolerance(datum)) {

            // copy datum for comparison later
            Datum originalDatum = new Datum(datum);
            datum.mid = (datum.min + datum.max) / 2.0f;
            System.out.print("Guess: " + datum.mid + " ");

            if (Math.pow(datum.mid, 2) > number) {
                datum.max = datum.mid;
                if (outOfTolerance(datum)) {
                    System.out.println("Guess Too High - dropping max");
                }
            } else {
                datum.min = datum.mid;
                if (outOfTolerance(datum)) {
                    System.out.println("Guess Too Low - raise min");
                }
            }

            if (originalDatum.compareTo(datum) == 0) {
                System.out.println(datum);
            }
        }
        System.out.println();
        return datum.mid;
    }

    private static boolean outOfTolerance(Datum datum) {
        return ((float) Math.abs(Math.pow(datum.mid, 2) - datum.number) >= datum.precision);
    }

    private static class Datum implements Comparable<Datum> {
        float min;
        float max;
        float mid;

        float number;
        float precision;

        // need to be able to have a copy constructor
        Datum() {

        }

        // copy constructor pattern - creates deep copy
        Datum(Datum datum) {
            this.min = datum.min;
            this.max = datum.max;
            this.precision = datum.precision;
            this.mid = datum.mid;
            this.number = datum.number;
        }

        @Override
        public int compareTo(Datum datum) {
            if(this.mid < datum.mid) {
                return -1;
            } else if (this.mid > datum.mid) {
                return 1;
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Datum datum = (Datum) o;
            return Float.compare(datum.min, min) == 0 && Float.compare(datum.max, max) == 0 && Float.compare(datum.mid, mid) == 0 && Float.compare(datum.number, number) == 0 && Float.compare(datum.precision, precision) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(min, max, mid, number, precision);
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Datum {");
            sb.append("min=").append(min);
            sb.append(", max=").append(max);
            sb.append(", mid=").append(mid);
            sb.append('}');
            return sb.toString();
        }
    }
}
