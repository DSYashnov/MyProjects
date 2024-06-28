package chapter_7.thread;

public class ThreadExample extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        t.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }



//        MyThread myThread = new MyThread();
//        MyThread2 myThread2 = new MyThread2();
//
//        myThread.start();
//        myThread2.start();
    }
}

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}