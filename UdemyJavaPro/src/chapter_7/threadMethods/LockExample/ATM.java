package chapter_7.threadMethods.LockExample;

import java.util.EnumMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Stas", lock);
        new Employee("Bob", lock);
        new Employee("John", lock);
        Thread.sleep(5000);
        new Employee("Jane", lock);
        new Employee("Jack", lock);
        }
    }

class Employee extends Thread {
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " waiting...");
//            lock.lock();
                System.out.println(name + " used in ATM");
                Thread.sleep(2000);
                System.out.println(name + " is ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " not used in ATM");
        }
    }
}