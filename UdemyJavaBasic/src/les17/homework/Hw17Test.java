package les17.homework;

public class Hw17Test {
    public static void main(String[] args) {
        Hw17 hw17 = new Hw17();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello!");
        boolean a = Hw17.ravenstvo(sb1, sb2);
        System.out.println(a);
    }

}
