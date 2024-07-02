package chapter_7.threadMethods.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        new Thread(() -> {
            int i = 0;
            while(true){
                try {
                    queue.put(++i);
                    System.out.println("Prodecer add number: " + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            int i = 0;
            while(true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consummer zabral: " + j);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
