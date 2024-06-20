package chapter_4.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        Math m1 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperation(3, 6));
        System.out.println(m1.doOperation(3, 6));
    }
}
interface Math {
    int doOperation(int a, int b);
}
