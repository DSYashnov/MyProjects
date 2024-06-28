package chapter_5.lambda;

public class Test {
    static void def(I i){
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        final int i = 10;
        def((String s) -> {
            System.out.println(i);
            return s.length() + i;});
    }
}
interface I {
    int abc(String s);
}
