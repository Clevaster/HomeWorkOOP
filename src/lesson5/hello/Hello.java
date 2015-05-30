package lesson5.hello;

import util.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Yana Vayzer on 30.05.2015.
 * Lesson 5 Task 2
 */
public class Hello {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(Constants.FILE_PATH_5 + "/1234.txt")) {

            //Can't write into same file. File is empty is same path/
            try (FileOutputStream fos = new FileOutputStream(Constants.FILE_PATH_5 + "/temp.txt")) {

                int size = fis.available();
                byte[] bytes = new byte[size];
                fis.read(bytes);

                String textHello = new String(bytes);

                System.out.println("textHello: " + textHello);

                String text1234 = textHello.replaceAll("[Hh]ello", "1234");
                System.out.println("text1234: " + text1234);

                byte[] out = text1234.getBytes();
                fos.write(out);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
