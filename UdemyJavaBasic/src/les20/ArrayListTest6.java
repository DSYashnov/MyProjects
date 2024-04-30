package les20;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest6 {
    public static void main(String[] args) {
        String s = "A";
        String s1 = "B";
        String s2 = "C";
        String s3 = "D";
        ArrayList<String> list = new ArrayList<String>();
        list.add(s2);
        list.add(s);
        list.add(s3);
        list.add(s1);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
