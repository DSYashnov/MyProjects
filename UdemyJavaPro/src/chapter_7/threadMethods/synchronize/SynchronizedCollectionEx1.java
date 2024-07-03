package chapter_7.threadMethods.synchronize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Runnable runnable = () -> {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {}
                System.out.println(iterator.next());
            };
            Runnable runnable1 = () -> {
                list.remove(10);
            };
                Thread t1 = new Thread(runnable1);
                Thread t2 = new Thread(runnable1);
                t1.start();
                t2.start();
                t1.join();
                t2.join();
            }
        }



