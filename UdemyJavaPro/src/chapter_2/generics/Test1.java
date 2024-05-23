package chapter_2.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
//        list.add("a");
//        list.add(1);
//        list.add(new String("b"));
//        list.add(new Car());
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");

        for (Object o : list){
            System.out.println(o + " length " + ((String)o).length());
        }
    }

}
class Car{

}
