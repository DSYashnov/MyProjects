package les5.lesson;

public class FunctionTest {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int sredneeArifmetic(int a1, int b1, int c1){
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }
}
class FunctionStart {
    public static void main(String[] args) {
        FunctionTest t = new FunctionTest();
        int summaThirtValue = t.summa(5,8,9);
        System.out.println(summaThirtValue);
        System.out.println(t.sredneeArifmetic(34, 54, 32));
    }
}
