package les23.test8;

public class A {
    String s1 = "Hello";
    static double d1 = 3.14;
    int summa(int ... i){
        int result = 0;
        for (int a : i){
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}
class B extends A{
    String s2 = super.s1 + ", friend";
    String s1 = super.s1;
    double d1 = super.d1;
    int summa(int ... i){
            int result = super.summa(i);
        System.out.println("Summa " + result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.s2);
        System.out.println();
    }
}
