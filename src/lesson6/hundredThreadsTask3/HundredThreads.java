package lesson6.hundredThreadsTask3;

/**
 * Created by Yana Vayzer on 01.06.2015.
 * lesson 6, task 3
 */
public class HundredThreads {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Hundred h = new Hundred();
            h.start();
        }

    }

    public static class Hundred extends Thread {


        @Override
        public void run() {
            System.out.println("Started: " + getName());
            while (!interrupted()) {
            }
            System.out.println("Interrupt: " + getName());

        }
    }


}
