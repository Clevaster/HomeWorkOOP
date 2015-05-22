package Lesson3.Shape;

/**
 * Created by Lena on 22.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] list = {
                new Circle("Circle", 5),
                new Rectangle("Rectangle", 5, 3),
                new Square("Square", 4),
                new Triangle("Triangle", 3,4,5)
        };

        for (Shape s : list){
            System.out.println(s.name + ": "+s.getSquare());
        }
    }




}
