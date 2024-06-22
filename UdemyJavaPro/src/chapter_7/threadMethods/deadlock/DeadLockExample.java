package chapter_7.threadMethods.deadlock;

import org.w3c.dom.ls.LSOutput;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

}
class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread1: монитор объекта lock1 захвачен");

            System.out.println("Thread1: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread1: монитор объекта lock1 and lock2 захвачены");
            }
        }
    }
}
class Thread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2: Попытка захватить монитор объекта lock2");
        synchronized (DeadLockExample.lock2) {
            System.out.println("Thread2: монитор объекта lock2 захвачен");

            System.out.println("Thread2: Попытка захватить монитор объекта lock1");
            synchronized (DeadLockExample.lock1) {
                System.out.println("Thread2: монитор объекта lock1 and lock2 захвачены");
            }
        }
    }
}