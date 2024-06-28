package chapter_3.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Stanislav");
        set.add("Karl");
        set.add("Mary");
        set.add("Igor");

        System.out.println(set);
        set.remove("Karl");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println(set.size());
        System.out.println(set.contains("Mark"));
    }
}
