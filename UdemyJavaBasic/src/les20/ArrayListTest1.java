package les20;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Bye"));
        list.add(new StringBuilder("Ok"));
        list.add(1, new StringBuilder("Hello"));
        for (StringBuilder str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("Petrov"));
        list1.add(new StringBuilder("Sidorov"));
        list.addAll(list1);
        for (StringBuilder str : list) {
            System.out.print(str + " ");
        }
        list1.get(1).append("!");
                System.out.println();
        for (StringBuilder str : list) {
            System.out.print(str + " ");

        }
    }

}
