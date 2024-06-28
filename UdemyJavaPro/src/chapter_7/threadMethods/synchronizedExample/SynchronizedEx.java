package chapter_7.threadMethods.synchronizedExample;

public class SynchronizedEx {

    static final Object lock = new Object();

     void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }
     void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }
     void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableCall());
        Thread t2 = new Thread(new RunnableCall1());
        Thread t3 = new Thread(new RunnableCall2());

        t1.start();
        t2.start();
        t3.start();
    }
}
class RunnableCall implements Runnable{
    public void run() {
        new SynchronizedEx().mobileCall();
    }
}
class RunnableCall1 implements Runnable{
    public void run() {
        new SynchronizedEx().skypeCall();
    }
}
class RunnableCall2 implements Runnable{
    public void run() {
        new SynchronizedEx().whatsAppCall();
    }
}


