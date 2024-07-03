package chapter_7.threadMethods.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
//        ArrayList<Integer> target = new ArrayList<>();
        List<Integer> syncList =
        Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> {syncList.addAll(source);};
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(syncList);
    }
}
