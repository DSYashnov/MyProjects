package chapter_2.parameterized_method;

import java.util.ArrayList;

public class Parameterized_method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("def");
        list1.add("jhi");
        String s = GenMethod.getSecondElement(list1);
        System.out.println(s);
    }
}
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}