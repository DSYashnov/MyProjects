package les20;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Bye");
        list.add("Hello");
        list.add("Ok");
        list.add(1, "Hello");
        for (String str : list) {
            System.out.println(str + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<String> list1 = new ArrayList();
        list1.add("Petrov");
        list1.add("Sidorov");
        list1.addAll(1, list);
        list1.set(1,"Ivanov");
        System.out.println(list1);
    }

}
