package lec18;

import lec18.Transport;
import lec18.db.DB;
public class Main {
    public static void main(String[] args) {

        final int count = 10;

        Person obj1 = new Person();
        Person.getCount();
        Person obj2 = new Person();
        Person.getCount();
        Person obj3 = new Person();
        Person.getCount();
        Person obj4 = new Person();
        Person.getCount();

//        Person.count = 5;
//        System.out.println(Person.count);
//
//        DB db = new DB();
//        info();
//        info("Hello World");

    }
    public static void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }

    public static void info(String word, float word2) {
        System.out.println(word + "!");

    }
}
