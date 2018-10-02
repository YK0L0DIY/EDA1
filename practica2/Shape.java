package practica2;

public abstract class Shape implements Comparable<Shape> {

    private double area;

    abstract double getArea();

    public abstract String toString();
}


