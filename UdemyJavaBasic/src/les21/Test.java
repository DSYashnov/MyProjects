package les21;

public class Test {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hello");
        s2 = new String("bye");
        s1 = s2;
        String s3 = s1;
        s1 = null;
    }
}
