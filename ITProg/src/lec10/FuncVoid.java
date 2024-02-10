package lec10;

public class FuncVoid {
    public static void main(String[] args) {
//        inf("Hello");
//        String java = "Java";
//        inf(java);
//        inf("");

        short num  = 7;
        int result = summa((short) 5, num);
        inf(String.valueOf(result));

        short num1  = 8;
        int result1 = summa((short) 4, num1);
        inf(String.valueOf(result1));
    }

    public static int summa(short a, short b){
        int res = a + b;
        String result = "Result: " + res;
        inf(result);
        return res;
    }
    public static void inf(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
