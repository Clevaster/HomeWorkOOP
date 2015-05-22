package Lesson3.Shape;

/**
 * Created by Lena on 22.05.2015.
 */
public class Triangle extends Shape  {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }
}
