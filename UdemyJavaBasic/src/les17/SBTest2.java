package les17;

public class SBTest2 {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Good Bye!!");

        String s1 = new String(sb1);
        String s2 = new String(sb2);

        System.out.println(s1);
        System.out.println(sb2);
    }
}
