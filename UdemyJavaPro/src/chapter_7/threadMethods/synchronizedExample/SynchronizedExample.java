package chapter_7.threadMethods.synchronizedExample;

public class SynchronizedExample {
   public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread.start();
        thread2.start();
        thread3.start();
    }
}
class Counter {
    volatile static int counter = 0;
}
class MyRunnable implements Runnable {

    private void doWork(){
        System.out.println(" Ura!");
    }

    public synchronized void incrementCounter() {
        doWork();
        synchronized (this) {
            Counter.counter++;
            System.out.print(Counter.counter);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            incrementCounter();
        }
    }
}

