package work.dataRace_sinchrinizedMethods;

public class DataRaceEx {
    static int counter = 0;;
    public static synchronized void increment(){
        counter++;
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
            DataRaceEx.increment();
        }

    }
}
