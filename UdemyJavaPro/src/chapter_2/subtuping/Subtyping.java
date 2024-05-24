package chapter_2.subtuping;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
//        A x = new B();
//        List<A> list = new ArrayList<A>();

        List<Number> list = new ArrayList<>();
        list.add(18);
        list.add(23.5);
        Info<Double> info = new Info<>(3.14);
        System.out.println(info);
        Double d = info.getValue();
    }
}
class A {

}
class B extends A {

}
class Info<T extends Number>{
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
class Bus{

}
interface I1{

}
interface I2{

}