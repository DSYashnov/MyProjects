package les21;

public class OverloadedTest {
    public void abs(String s){
        System.out.println(s);
    }
    public void abs(boolean b){
        System.out.println(b);
    }
    public StringBuilder abs(StringBuilder sb){
        return new StringBuilder(sb);
    }
    public static void main(String[] args) {
        OverloadedTest ot = new OverloadedTest();
        System.out.println(ot.abs(new StringBuilder("hi")));
    }
}
