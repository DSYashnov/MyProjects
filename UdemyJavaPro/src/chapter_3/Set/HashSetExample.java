package chapter_3.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(8);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(7);
        set1.add(4);
        set1.add(3);
        set1.add(5);
        set1.add(8);

        HashSet<Integer> subtract = new HashSet<>(set);

        subtract.removeAll(set1);
        System.out.println(subtract);
    }
}
