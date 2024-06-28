package chapter_7.threadMethods.threadSleep_threadPriority;

public class ThreadExample2 implements Runnable {
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadExample2());
        thread.start();
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
