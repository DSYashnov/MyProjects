package chapter_7.threadMethods.LockExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                call.whatsAppCall();
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
    }
}
class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try{
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall(){
        lock.lock();
        try{
            System.out.println("skypeCall call starts");
            Thread.sleep(3000);
            System.out.println("skypeCall call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void whatsAppCall(){
        lock.lock();
        try{
            System.out.println("whatsAppCall call starts");
            Thread.sleep(3000);
            System.out.println("whatsAppCall call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}