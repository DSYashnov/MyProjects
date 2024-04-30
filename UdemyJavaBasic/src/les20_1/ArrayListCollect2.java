package les20_1;

import java.util.ArrayList;

public class ArrayListCollect2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        for (String s : list) {
            System.out.println("number = " + s +
                    " end length = " + (s.length()));
        }
    }
}
