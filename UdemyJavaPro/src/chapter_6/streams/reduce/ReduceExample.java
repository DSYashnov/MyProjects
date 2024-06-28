package chapter_6.streams.reduce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce(1,(a, b) -> a * b);
        System.out.println(result);

        List<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        String result2 = list2.stream().reduce((a,b)->a+ " " + b).get();
        System.out.println(result2);

//        List<Integer> list1 = new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((a, b) -> a * b);
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }
    }
}
