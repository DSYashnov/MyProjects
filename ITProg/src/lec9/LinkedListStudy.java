package lec9;

import java.util.LinkedList;

public class LinkedListStudy {
    public static void main(String[] args) {
        LinkedList<Float> list = new LinkedList<>();
        list.add(5.6f);
        list.add(15.64f);
        list.add(345.66f);

        for (Float el : list){
            System.out.println(el);
        }
    }
}
