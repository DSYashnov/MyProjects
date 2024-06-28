package chapter_7.threadMethods.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private  static void marketStaffsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private  static void everyThinkIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everythink is ready, so let`s open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private  static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opend");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Stanislav", countDownLatch);
        new Friend("Donald", countDownLatch);
        new Friend("Mariya", countDownLatch);
        new Friend("Jack", countDownLatch);
        new Friend("John", countDownLatch);

        marketStaffsOnPlace();
        everyThinkIsReady();
        openMarket();
    }
}
class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is ready");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
