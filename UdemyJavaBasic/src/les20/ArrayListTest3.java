package les20;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Bye"));
        list.add(new StringBuilder("Ok"));
        list.add(new StringBuilder("NOT!"));
        for (StringBuilder s : list) {
            System.out.println(s + " ");
        }
        System.out.println(list.indexOf(new StringBuilder("Hello")));

    }

}
