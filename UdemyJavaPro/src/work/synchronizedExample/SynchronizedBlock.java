package work.synchronizedExample;

public class SynchronizedBlock {
    static int counter = 0;;
    public static void increment() {
        synchronized (SynchronizedBlock.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new R());
        Thread thread1 = new Thread(new R());

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(counter);
    }
}
class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <1000; i++) {
            SynchronizedBlock.increment();
        }

    }
}

