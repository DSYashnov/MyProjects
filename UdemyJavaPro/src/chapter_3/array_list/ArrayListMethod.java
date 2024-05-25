package chapter_3.array_list;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"D");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.set(1, "D");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
