package chapter_9.regularExpressions;

public class ReplaceAll {
    public static void main(String[] args) {
        String s1 = "hello   my   friend!    How    are    you fill?";
        System.out.println(s1);
        s1 = s1.replace("How", "Dick");
        System.out.println(s1);
        System.out.println("-----------------------------");

//        s1 = s1.replaceAll(" {2,}", " ");
//        System.out.println(s1);
//        s1 = s1.replaceAll("\\bf\\w+", "4444");
//        System.out.println(s1);

        s1 = s1.replaceFirst("\\bf\\w+", "4444");
        System.out.println(s1);
    }
}
