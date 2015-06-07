package lesson5.helloTask2;

import util.Constants;

import java.io.*;

/**
 * Created by Yana Vayzer on 30.05.2015.
 * Lesson 5 Task 2
 */
public class Hello {
    public static void main(String[] args) {

        String str;
        StringBuilder text = new StringBuilder();
        String file = Constants.FILE_PATH_5 + "/1234.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                text.append(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        str =  text.toString().replaceAll("[Hh]ello", "1234");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
/*
        //reading stream

        try (FileInputStream fisReader = new FileInputStream(Constants.FILE_PATH_5 + "/1234.txt")) {

            //size of file
            int size = fisReader.available();

            //array for bytes fron file
            byte[] bytes = new byte[size];

            // reading bytes from file into array
            fisReader.read(bytes);

            //Bytes array toString
            String textHello = new String(bytes);

            System.out.println("textHello: " + textHello);

            String text1234 = textHello.replaceAll("[Hh]ello", "1234");
            System.out.println("-----------------------");
            System.out.println("text1234: " + text1234);

            fisReader.close();

            try (FileOutputStream fos = new FileOutputStream(Constants.FILE_PATH_5 + "/1234.txt")) {

                byte[] out = text1234.getBytes();
                fos.write(out);

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

*/

    }
}
