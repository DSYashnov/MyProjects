package les30.work;

public class Work {
    static void def(Test t){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        def(x->x.length());
    }
}
interface Test{
    int abc(String s);
}
