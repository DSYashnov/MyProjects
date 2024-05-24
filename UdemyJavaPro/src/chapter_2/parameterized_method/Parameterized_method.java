package chapter_2.parameterized_method;

import java.util.ArrayList;

public class Parameterized_method {
    public static void main(String[] args) {

    }
}
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}