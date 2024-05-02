package les21;

public class TernaryTest {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a < 4 ? 7 : "privet");

        int b = 5;
        int c = 5;

        int d = (b < c) ? b++ : c++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
