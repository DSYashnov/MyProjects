package les16;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abcdefghijklmno");

        String s10 = s1.substring(3);
        System.out.println(s10);

        String s11 = s1.substring(3, 7);
        System.out.println(s11);

        String s12 = s1.replace("abc", "vivka");
        System.out.println(s12);

        String s2 = "poka";
        String s3 = s2.replace("k", "k");
        System.out.println(s2 == s3);
    }
}
