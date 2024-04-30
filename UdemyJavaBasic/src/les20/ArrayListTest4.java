package les20;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add(new String("Hello"));
            list.add(new String("Bye"));
            list.add(new String("Ok"));
            list.add(new String("NOT!"));
            for (String s : list) {
                System.out.println(s + " ");
            }
            System.out.println(list.lastIndexOf(new String("NOT!")));
            System.out.println(list.size());
            System.out.println(list.isEmpty());
            System.out.println(list.contains("Hello"));
            System.out.println(list);
        }
    }


