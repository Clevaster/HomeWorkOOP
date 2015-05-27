package lesson4.comparable;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Lena on 24.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)
        };



        Arrays.sort(list, new HumanComparator());
        System.out.println("-----compare-------------");
        for (Human h : list)
            System.out.println(h.getAge());

        Arrays.sort(list, Collections.reverseOrder());
        System.out.println("-----reverse-------------");
        for (Human h : list)
            System.out.println(h.getAge());




    }
}