package lesson6.groupTask4;

/**
 * Created by Yana Vayzer on 01.06.2015.
 * lesson 6, task 1
 */
public class MyGroupThread {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("MyGroup");

        for (int i = 0; i <50 ; i++) {
            Fifty thread = new Fifty(group, "MyThread" + i);
            thread.start();
        }

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        group.interrupt();
    }

    public static class Fifty extends Thread{

        public Fifty(String name){
            super(name);
        }

        public Fifty(ThreadGroup group, String name) {
            super(group, name);
        }

        @Override
        public void run() {
            int x = 0;

            while (!isInterrupted()){
                System.out.println(getName() + ": " +x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;

                }
            }
        }
    }


}
