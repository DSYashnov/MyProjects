package chapter_7.threadMethods.sleepANDjoin;

public class SleepAndJoinTwoStreamExample extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        SleepAndJoinTwoStreamExample t2 = new SleepAndJoinTwoStreamExample();
        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println("Finish");

    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}