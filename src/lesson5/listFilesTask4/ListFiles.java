package lesson5.listFilesTask4;

import util.Constants;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yana Vayzer on 31.05.2015.
 * Lesson 5, task 4
 */
public class ListFiles {

    public static void main(String[] args) {
        String pathFile = Constants.FILE_PATH_5 + "/listFilesTask4.txt";
        String src = Constants.FILE_PATH_4;

        ListFiles txt = new ListFiles();
        txt.listFiles(pathFile, src);
    }


    public void listFiles(String pathFile, String src) {

        //for info about Files
        List<String> info = new ArrayList<>();

        //Source directory
        File srcDir = new File(src);

        //write to file
        try (FileOutputStream writer = new FileOutputStream(pathFile)) {

            //write info about files info the List<Strings>
            if (srcDir.isDirectory()) {
                File[] files = srcDir.listFiles();
                if (files != null) {
                    for (File f : files) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
                        info.add(" File: " + f.getName()
                                + " Path: " + f.getPath()
                                + " Modified date: " + simpleDateFormat.format(f.lastModified()) );
                    }
                }
            }
            //write from list to file, each string to byte array
            for (String s : info){
                byte[] buf = s.getBytes();
                writer.write(buf);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
