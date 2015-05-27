package lesson411.shape11;

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

/*    double � = Math.pow(x, a) ;
    ����������� ���������� � �������� ���������� �, ����������� � ������� �.*/
}
