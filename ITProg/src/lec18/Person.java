package lec18;

import java.lang.module.Configuration;

public class Person {
    private static int count;

    public Person() {
        count++;
    }

    public static void getCount(){
        System.out.println("Количество: " + count);
    }

}
