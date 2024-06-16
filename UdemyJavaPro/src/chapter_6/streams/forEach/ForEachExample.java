package chapter_6.streams.forEach;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(arr).forEach(e-> {e *=2;
            System.out.println(e);});
        System.out.println("--------------");
        //Arrays.stream(arr).forEach(e->System.out.println(e));
        Arrays.stream(arr).forEach(Utils::myMethod);
        Arrays.stream(arr).forEach(e->Utils.myMethod(e));
    }
}
class Utils{
    public static void myMethod(int a){
       a= a + 5;
        System.out.println("Element = " + a);
    }
}