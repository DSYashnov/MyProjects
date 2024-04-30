package les20_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollect1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        List<String> list1 = List.of("odin", "dva", "tri");
        System.out.println(list1);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2);
    }
}
