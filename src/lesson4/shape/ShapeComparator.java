package lesson4.shape;

import java.util.Comparator;

/**
 * Created by Lena on 24.05.2015.
 */
public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape f1, Shape f2) {

        if (f1.getSquare() < f2.getSquare())
            return -1;
        else if (f1.getSquare() == f2.getSquare())
            return 0;
        else if (f1.getSquare() > f2.getSquare())
            return 1;
        else
            return 0;
    }


}
