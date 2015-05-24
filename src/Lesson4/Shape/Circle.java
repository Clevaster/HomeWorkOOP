package Lesson4.Shape;

/**
 * Created by Lena on 22.05.2015.
 */
public class Circle extends Shape {
    private double r;

    public Circle(String name) {
        super(name);
    }

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public double getSquare() {
        return Math.PI * r*r;
    }

/*    double у = Math.pow(x, a) ;
    присваивает переменной у значение переменной х, возведенное в степень а.*/
}
