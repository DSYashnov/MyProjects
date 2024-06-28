package chapter_6.streams.mapStreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        for(int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(element->element.length()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

        int [] arr = {5, 9, 3, 8, 1};
        arr = Arrays.stream(arr).map(element
                        -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("ab");
        set.add("abc");
        set.add("abcd");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        List <Integer> list3 = set.stream().map(e->e.length()).collect(Collectors.toList());
        System.out.println(list3);
    }

}
