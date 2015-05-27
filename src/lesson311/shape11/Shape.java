package lesson311.shape11;

/**
 * Created by Lena on 22.05.2015.
 */
public abstract class Shape {
    public String name; // доступен для наследников

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getSquare();
}
