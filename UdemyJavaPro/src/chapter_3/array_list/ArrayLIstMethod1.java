package chapter_3.array_list;

import java.util.ArrayList;

public class ArrayLIstMethod1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list);
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("!!!");
//        list1.add("???");
//        list.addAll(1, list1);
//        System.out.println(list);
//        list.clear();
        //System.out.println(list);
        //list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.contains("A"));

    }
}
