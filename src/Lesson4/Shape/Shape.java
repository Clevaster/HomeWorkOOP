package Lesson4.Shape;

import java.util.Comparator;

/**
 * Created by Lena on 22.05.2015.
 */
public abstract class Shape <Shape> {

    public String name; // доступен для наследников

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getSquare();


}
