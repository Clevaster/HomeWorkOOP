package lesson311.shape11;

/**
 * Created by Lena on 22.05.2015.
 */
public class Square extends Shape {
    private double a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getSquare() {
        return a * a;
    }
}
