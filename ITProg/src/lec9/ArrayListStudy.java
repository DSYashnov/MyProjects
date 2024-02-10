package lec9;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(50);
        list.add(1, 30);

        //System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(1);
        list.clear();

        for (Integer el : list)
            System.out.println(el);
    }
}
