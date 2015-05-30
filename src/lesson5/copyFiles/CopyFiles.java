package lesson5.copyFiles;

import com.sun.org.apache.xpath.internal.SourceTree;
import util.Constants;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

/**
 * Created by Yana Vayzer on 30.05.2015.
 * Lesson 5, task 3
 */
public class CopyFiles {
    public static void main(String[] args) {

        CopyFiles cf = new CopyFiles();
        cf.copyFiles(Constants.FILE_PATH_4, Constants.FILE_PATH_5 + "/task3");
    }

    public void copyFiles(String srcDir, String destDir) {

        File src = new File(srcDir);
        File dest = new File(destDir);
        File[] srcArr = src.listFiles();

        if (srcArr != null) {
            for (File f : srcArr) {
                if (f.isFile()) {
                    try {
                        Files.copy(f.toPath(), dest.toPath().resolve(f.getName()));
                        System.out.println(f.getName() + " is successfully copied to" + dest);
                    } catch (FileAlreadyExistsException e) {
                        System.out.println("Error: " + f.getName() + " is already exists in" + dest);
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
