package lec10;

public class FuncSum {
    public static void main(String[] args) {
        inf("Hello");
        String java = "Java";
        inf(java);
        inf("");

        short num  = 7;
        summa((short) 5, num);

        short num1  = 8;
        summa((short) 4, num1);
    }

    public static void summa(short a, short b){
        int res = a + b;
        String result = "Result: " + res;
        inf(result);
    }
    public static void inf(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
