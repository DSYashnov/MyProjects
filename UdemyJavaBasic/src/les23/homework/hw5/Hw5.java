package les23.homework.hw5;

public class Hw5 {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 + " ");
    }
}
class X {
    String s1 = "hello";
}
class Y extends X {
    boolean bool = false;
}

