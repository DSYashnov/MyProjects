package chapter_7.threadMethods.interruption;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if(isInterrupted()){
                System.out.println("Stream want stop");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok hotyat prervat vo vremya sna");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}