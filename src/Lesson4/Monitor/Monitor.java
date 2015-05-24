package Lesson4.Monitor;

import java.io.File;
import java.util.ArrayList;

public class Monitor {

    ArrayList<String> fileNameList;
    IFileEvent event;


    public Monitor(IFileEvent event, ArrayList<String> fileNameList) {
        this.event = event;
        this.fileNameList = fileNameList;
    }

    public void start() {

        while (true) {

            for (int i = 0; i < fileNameList.size(); i++) {
                File f = new File(fileNameList.get(i));

                if (f.exists() && f.isFile()) {
                    if (event != null)
                        event.onFileAdded(f);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Waiting...");
        }
    }
}
