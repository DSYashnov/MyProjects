package les26.test5;

public class Test5 {
    {
        System.out.println("This is a init block 3");
    }
    Test5 () {
        System.out.println("This is a constructor 1");
    }
    Test5 (int a) {
        this();
        System.out.println("This is a constructor 2");
    }
    {
        System.out.println("This is a init block 1");
    }
    {
        System.out.println("This is a init block 2");
    }
    static {
        System.out.println("This is STATIC a init block 1");
    }
    static {
        System.out.println("This is STATIC a init block 2");
    }


    public static void main(String[] args) {
        Test5 test1 = new Test5();
        Test5 test2 = new Test5(3);
    }
}
