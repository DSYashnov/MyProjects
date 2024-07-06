package chapter_9.regularExpressions;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Ukraine, Dnipro, Lenin street, 51, Flat 48," +
                " email: stanislav@gmail.com, Postcode: 49000, Phone Number: +123456789;"
                + "Petrenko Olga, Ukraine, Kyiv, Khreshchatyk street, 22, Flat 12," +
                " email: olga.petrenko@example.com, Postcode: 01001, Phone Number: +987654321;"
                + "Semenov Andriy, Ukraine, Lviv, Svobody avenue, 3, Flat 56," +
                " email: andriy.semenov@example.com, Postcode: 79000, Phone Number: +1122334455;";

        String s2 = "astanislav@gmail.com";
        boolean res = s2.matches("\\w+@\\w+\\.com");
        System.out.println(res);

        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
