package les30_1.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List list = List.of("Hello","Bye", "how are you", "i`m ok");
        list.forEach(s -> System.out.println(s));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.removeIf(elem -> elem % 3 == 0);
        Predicate<Integer> predicate = elem -> elem % 3 == 0;
        arrayList.removeIf(predicate);
        System.out.println(arrayList);
        arrayList.sort((x,y) -> -x.compareTo(y));
        System.out.println(arrayList);
    }

}
