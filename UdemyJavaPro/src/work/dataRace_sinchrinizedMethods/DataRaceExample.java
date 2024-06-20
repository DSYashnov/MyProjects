package work.dataRace_sinchrinizedMethods;

public class DataRaceExample {
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
    static int counter = 0;
}
class MyRunnable implements Runnable {
    public void incrementCounter() {
        Counter.counter++;
        System.out.print(Counter.counter + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            incrementCounter();
        }
    }
}