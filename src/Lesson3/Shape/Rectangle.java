package Lesson3.Shape;

/**
 * Created by Lena on 22.05.2015.
 */
public class Rectangle extends Shape {
    private double m;
    private double n;

    public Rectangle(String name, double m, double n) {
        super(name);
        this.m = m;
        this.n = n;
    }

    @Override
    public double getSquare() {
        return m * n;
    }
}
