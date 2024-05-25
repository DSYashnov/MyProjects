package chapter_3.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        List<Integer> list1 = List.of(3, 8, null);
        System.out.println(list1);
        List<String> list2 = List.copyOf(list);
        System.out.println(list2);

//        System.out.println("ArrayList = " + list);
//
//        Object[] arr = list.toArray();
//        String [] arr2 = list.toArray(new String[0]);
//        for(Object obg : arr){
//            System.out.print(obg + ", ");
//        }
//        System.out.println();
//        for(String s : arr2){
//            System.out.print(s + ", ");
//        }

//
//        List<String> myList = list.subList(1, 4);
//        System.out.println("SubList = " + myList);
//        myList.add("J");
//        System.out.println("SubList = " + myList);
//        System.out.println("ArrayList = " + list);
//        list.add("M");
//        System.out.println("ArrayList = " + list);
//        System.out.println("SubList = " + myList);



//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("B");
//        list1.add("F");
//        list1.add("D");
//        System.out.println(list1);
//
//        list.retainAll(list1);
//        System.out.println(list);
//
//        boolean result = list.contains(list1);
//        System.out.println(result);
//
//
    }
}
