package les26.test6;

public class Test6 {
        int a = 3;

    Test6(){
        int a = 4;
    }

    {
        int a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}
class A{
    static final int b;
    int a = 5;
    static {
        b = 10;
    }
}
class B{
    static int c;
    static final int d;
    final static int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
        //e = 2;
        f = 0;
    }
}
class C{
    String s = "ok";
    {
        System.out.println(s);
    }
    static int i = 0;
    static {
        System.out.println(i);
    }
    {
        i = i + 1;
        System.out.println(i);
    }
    C(){
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello All");
        C c = new C();
    }
}
class D{
    static {
        abc(2);
    }
    static void abc(int a){
        System.out.println(a + "");
    }

    D(){
        abc(5);
    }

    {
        abc(4);
    }
    {
        abc(6);
    }
    static {
        new D();
    }

    {
        abc(8);
    }

    public static void main(String[] args) {

    }
}

