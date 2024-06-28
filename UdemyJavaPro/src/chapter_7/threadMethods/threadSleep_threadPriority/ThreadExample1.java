package chapter_7.threadMethods.threadSleep_threadPriority;

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("my_potok");
        myThread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("namee of myThread1: " + myThread1.getName() +
                " Priority of myThread1: " + myThread1.getPriority());
    }
}
class MyThread1 extends Thread {
    public void run() {
        System.out.println("hello");
    }
}
