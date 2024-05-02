package les21;

public class IntCharTest {
    void abc (int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        IntCharTest test = new IntCharTest();
        char c = 'a';
        test.abc(c);
        System.out.println('b' + 10);
    }
}
