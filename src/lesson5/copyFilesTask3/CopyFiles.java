package lesson5.copyFilesTask3;

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
                        /**copy
                         *  @param   source
                         *         the path to the file to copy
                         * @param   target
                         *          the path to the target file (may be associated with a different
                         *          provider to the source path)
                         * @param   options
                         *          options specifying how the copy should be done*/
                        Files.copy(f.toPath(), dest.toPath().resolve(f.getName()));
                        System.out.println(f.getName() + " is successfully copied to" + dest);
                    } catch (FileAlreadyExistsException e) {
                        System.out.println("Error: " + f.getName() + " is already exists in" + dest);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    }
}
