package chapter_2.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
//        List<Number> numbers = new ArrayList<Integer>();
//        List<Object> numbers1 = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
        list.add("hello");

        List<Double> list1 = new ArrayList<Double>();
        list1.add(33.14);
        list1.add(321.12);
        list1.add(38.64);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("def");
        list2.add("ghi");
        showListInfo(list2);
    }
    static void showListInfo(List<?> list) {
        System.out.println("my list has next value: " + list);
    }
}
