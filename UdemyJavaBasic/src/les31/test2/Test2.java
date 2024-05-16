package les31.test2;

import javax.swing.*;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
//        ArrayList al = new ArrayList<>();
//        int i = al.get(0);
//        int i = (Integer)al.get(0);





        al.add(10);
        al.add(30);
        al.add(150);
        int a = GenMethod.getSecondElement(al);
        System.out.println(a);
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("A");
        al1.add("B");
        al1.add("C");
        String s = GenMethod.getSecondElement(al1);
        System.out.println(s);

    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);
    }
}