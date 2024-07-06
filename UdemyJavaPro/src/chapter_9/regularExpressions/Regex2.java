package chapter_9.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern = Pattern.compile("ABC");

//        String s1 = "ABCOPABD7OP";
//        Pattern pattern = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("abc[^e-g4-7]");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("abc.");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("^abc");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("abch$");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("\\D");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("\\w");

//        String s1 = "abcd abce abc5fabcg6abch";
//        Pattern pattern = Pattern.compile("\\w+");

//        String s1 = "abcd!?abce===abc++ 5fabcg6abch";
//        Pattern pattern = Pattern.compile("\\W+");

//        String s1 = "poka abc Stanislav home film";
//        Pattern pattern = Pattern.compile("\\w{4}");

//        String s1 = "poka     abc   Stanislav         home   film";
//        Pattern pattern = Pattern.compile("\\w\\S+\\W");

//        String s1 = "poka abc3 Stanislav home film!!!!!!!!!!!!!";
//        Pattern pattern = Pattern.compile("\\D{2,}");

//        String s1 = "DADCDABABDABABABABD";
//        Pattern pattern = Pattern.compile("D(AB){2,3}");

        String s1 = "abcd abce abc5fabcg6abch";
        Pattern pattern = Pattern.compile("[abcd][efgh3-8]");

        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            System.out.println("position: " + matcher.start() + "   " + matcher.group());
        }
    }
}
