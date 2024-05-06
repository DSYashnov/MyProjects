package les24.test5;

import java.util.ArrayList;

public class Test5 {

}
interface I1 {
    default void abc(){
        System.out.println("this is method abc");
    }
    default void def() {
        System.out.println("this is method def");
    }
    static void ghi() {
        System.out.println("this is  static method ghi");
    }
}
interface I2 {
    static void ghi() {
        System.out.println("this is method ghi 2");
    }
}
abstract class O{

}
class R extends O implements I1{

}
class D implements I2{

}


//class X2 implements I1 {
//    public void abc(){
//        System.out.println("this is method abc");
//    }
//
//    public static void main(String[] args) {
//        X2 x = new X2();
//        x.abc();
//        x.def();
//    }
//}
