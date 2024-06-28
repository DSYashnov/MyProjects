package chapter_7.threadMethods.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Steve", callBox);
        new Person("Mariya", callBox);
        new Person("Stanislav", callBox);
        new Person("John", callBox);
        new Person("Shon", callBox);
    }
}
class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run() {
        System.out.println(name + " is wait...");
        try {
            callBox.acquire();
            System.out.println(name + " is call");
            sleep(2000);
            System.out.println(name + " is finish call");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
        }
    }
}