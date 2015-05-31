package lesson6.timeTask2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Created by Yana Vayzer on 01.06.2015.
 * lesson 6, task 2
 */
public class Time {

    public static void main(String[] args) {

        TimeThread thread = new TimeThread();
        thread.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'q' to finish");
        if (sc.nextLine().equalsIgnoreCase("Q")) {
            thread.interrupt();
        }
    }


    public static class TimeThread extends Thread {

        @Override
        public void run() {


            while (!interrupted()) {

                try {
                    Thread.sleep(10_000);
                    System.out.println("Current time is: " + LocalTime.now());
                } catch (InterruptedException e) {

                    System.out.println("Thread Interrupted");
                    return; //if interrupt when sleep
                }

            }
        }
    }
}
