package les20_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollect {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("all = " + list);
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("one");
//        list1.add("three");
//        list1.add("four");
        //list1.add("ten");

//        boolean result = list.containsAll(list1);
//        System.out.println(result);
        //System.out.println("all = " + list);
        List<String> list1 = list.subList(1, 4);
        System.out.println(list1);
        list1.add("ten");
        System.out.println(list);
        System.out.println(list1);

        Object [] array = list.toArray();
        String [] arrya1 = list.toArray(new String[15]);
        for( String str : arrya1 ){
            System.out.print(str + " ");
        }

    }
}
