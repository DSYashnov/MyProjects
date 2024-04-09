package les16;

public class Test4 {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "Urraaaaaaaaaa!!!";
        String s2 = s.concat(s1).trim().replace("Urraaaaaaaaaa!!!", "YPA").substring(6, 10);
        System.out.println(s.substring(s.indexOf('W')));
    }
}
