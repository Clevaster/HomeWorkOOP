package lesson6.counterTask1;

/**
 * Created by Yana Vayzer on 01.06.2015.
 * lesson 6, task 1
 */
public class Main {
    public static class Counter extends Thread {
        int first;
        int last;

        Counter(int first, int last){
            this.first = first;
            this.last = last;
        }


        public void run() {
            for (int i = first; i <= last ; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }


        }
    }
    public static void main(String[] args) {
        try {
            Counter c = new Counter(10, 20);
            c.start();
            c.join();
            System.out.println("Thread finished");
        } catch (Exception e) {

        }
    }
}