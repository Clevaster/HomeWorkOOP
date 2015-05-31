package lesson5.sequenceTask6;

import util.Constants;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Yana Vayzer on 31.05.2015.
 * lesson 5, task6
 */
public class Sequence {
    public static void main(String[] args) {

        Vector<String> files = new Vector<>();
        files.addElement(Constants.FILE_PATH_5 + "/task6/1.txt");
        files.addElement(Constants.FILE_PATH_5 + "/task6/2.txt");
        files.addElement(Constants.FILE_PATH_5 + "/task6/3.txt");

        InputStream input = new SequenceInputStream(new InputStreamEnum(files));

        try (FileOutputStream write = new FileOutputStream((Constants.FILE_PATH_5 + "/task6/all.txt"))) {
            while (input.read() != -1) {
                write.write(input.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class InputStreamEnum implements Enumeration<FileInputStream> {
        private Enumeration<String> files;

        public InputStreamEnum(Vector<String> files) {
            this.files = files.elements();
        }

        @Override
        public boolean hasMoreElements() {
            return files.hasMoreElements();
        }

        @Override
        public FileInputStream nextElement() {
            try {
                return new FileInputStream(files.nextElement());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }


        }
    }


}
