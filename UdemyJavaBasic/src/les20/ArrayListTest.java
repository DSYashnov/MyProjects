package les20;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("pribet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList();
        list2.add("ok");
        ArrayList<StringBuilder> list3 = new ArrayList();
        list3.add(new StringBuilder("ok"));
        ArrayList<String> list4 = new ArrayList(list2);
        System.out.println(list4);
    }
}

class Car{

}
class Student {

}
