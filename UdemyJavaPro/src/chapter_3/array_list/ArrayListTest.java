package chapter_3.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        list.add("Stanislav");
        list.add("Bob");
        list.add("Mary");
        list.add("John");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(200);
        list2.add("Stanislav");
        list2.add("Bob");
        list2.add("Mary");
        list2.add("John");
        list2.add("Jane");
        List<String> list3 = new ArrayList<>();

        ArrayList<String> list4 = new ArrayList<>(list);
        System.out.println(list4);
        System.out.println(list==list4);

    }
}
