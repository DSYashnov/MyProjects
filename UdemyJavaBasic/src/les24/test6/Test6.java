package les24.test6;

public class Test6 {

}
interface I1 {
    private static void method1(){
        System.out.println("static method 1");
    }
    private void method2(){
        System.out.println("static method 2");
    }
    default void method3(){
        method1();
        method2();
    }
    static void method4(){
        method1();
    }
}

