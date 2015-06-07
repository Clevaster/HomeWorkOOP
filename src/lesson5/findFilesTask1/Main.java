package lesson5.findFilesTask1;

import util.Constants;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //  boolean accept(File dir, String name);

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    /*
     * @param srcPath sourse directory
     * @param filter  list of extensions
     *
     */
    public static List<String> findFilesFromList(String srcPath, List<String> filter) throws IOException {

        File dir = new File(srcPath);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < filter.size(); i++) {
            File[] nextExtension = dir.listFiles(new MyFileFilter(filter.get(i)));
            for (File f : nextExtension)
                result.add(srcPath + "/" + f.getName());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> filter = new ArrayList<>(2);
        filter.add(".txt");
        filter.add(".doc");
        try {
            List<String> result = findFilesFromList(Constants.FILE_PATH_4, filter);
            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}