package chapter_5.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("bye");
        list.add("ok");
        list.add("learn java");
        list.add("lambda");

//        list.removeIf(element -> element.length() < 5);
        Predicate<String> p = element -> element.length() < 5;
        list.removeIf(p);
        System.out.println(list);
    }
}
