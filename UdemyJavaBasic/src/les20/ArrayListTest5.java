package les20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        StringBuilder sb1 = new StringBuilder("B");
        StringBuilder sb2 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(sb1);
        list.add(sb2);
        ArrayList<StringBuilder> list2 = list;
        ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();

        Object[] arr = list1.toArray();
        for(Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
        StringBuilder [] arr2 = list.toArray(new StringBuilder[10]);
        for(Object o : arr2){
            System.out.print(o + " ");
        }
        System.out.println();
        StringBuilder [] array = {sb, sb1, sb2};
        List<StringBuilder> list3 = Arrays.asList(array);
        System.out.println(list3);
        array[0].append("!!!!!!!!");
        System.out.println(list3);
        array[0] = new StringBuilder("!!!!!!!");
        System.out.println(list3);
    }
}
