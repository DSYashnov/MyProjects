package les30_1.test1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        var testInferenceType = new TestInferenceType();
        var i  = 10;
        var w = 1.5f;
        var arr = new String[]{"A", "B", "C"};
        var result = abc();
        Object obj = "hello";
        var obj2 = obj;
        ArrayList<String> a1 = new ArrayList<>();
        for(var s : a1){
            System.out.println(s);
        }

    }
    static double abc(){return 3.14;}
}
class TestInferenceType{
}
interface I{
    void abc();
    default void def(){}
    default void def1(){}
    static void def2(){}
}
