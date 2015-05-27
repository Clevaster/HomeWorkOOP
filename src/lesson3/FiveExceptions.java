package lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 24.05.2015.
 */

/*2. Find five standard library classes, whose methods throw an exception
and write a sample code for their processing. */

public class FiveExceptions {
    public static void main(String[] args) {

        try {
            int i = 15/0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Divizing by zero");;

        }

        try {
            int[] mass = new int[]{1,2,3,4,5};
            System.out.println(mass[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array bounds");
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("E://3.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        }

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("There is no string");
        }

        try {
            Integer.parseInt("String");
        } catch (NumberFormatException e) {
            System.out.println("This is not number");
        }

        try {
            List<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of the list bounds");
        }
 /*3   ---------- Integer.parseInt analog throw Exception*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
