package lesson5.findFilesTask1;

import util.Constants;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        //Directory
        File dir = new File(srcPath);

        //Array of filtered results
        File[] files = dir.listFiles(new MyFileFilter(ext));

        //Add results to List
        for (File file : files) {
            list.add(srcPath + file.getName());
        }
    }
// 1.------------------------------------------------------------------------

    /**
     * @param srcPath sourse directory
     * @param filter  list of extensions
     * @param result  for list of path
     */
    public static void findFilesFromList(String srcPath, List<String> filter, List<String> result) throws IOException {

        File dir = new File(srcPath);


        for (int i = 0; i < filter.size(); i++) {
            File[] nextExtension = dir.listFiles(new MyFileFilter(filter.get(i)));
            for (File f : nextExtension)
                result.add(srcPath + "/" + f.getName());
        }

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        try {

            findFiles(Constants.FILE_PATH_4, ".txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);

        System.out.println("--------------------------------");


// 1.------------------------------------------------------------------------
        List<String> filter = new ArrayList<>(2);
        filter.add(".txt");
        filter.add(".doc");
        List<String> result = new ArrayList<>();

        try {
            findFilesFromList(Constants.FILE_PATH_4, filter, result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : result)
            System.out.println(s);


    }

}