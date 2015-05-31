package lesson5.copyFilesTask5;

import util.Constants;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

/**
 * Created by Yana Vayzer on 31.05.2015.
 * Lesson 5, task5
 */

public class CopyFiles {
    public static void main(String[] args) {

        CopyFiles cf = new CopyFiles();
        cf.copyFiles(Constants.FILE_PATH_4, Constants.FILE_PATH_5 + "/task5/");
    }

    public void copyFiles(String srcDir, String destDir) {

        File src = new File(srcDir);
        File[] srcArr = src.listFiles();


        if (srcArr != null) {
            for (File f : srcArr) {
                if (f.isFile()) {
                    try (
                            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
                            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destDir + f.getName()))
                    ) {
                        while ((bis.read()) != -1) {
                            bos.write(bis.read());
                        }
                        System.out.println(f.getName() + " is successfully copied to" + destDir);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
