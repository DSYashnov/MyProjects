package les28.test8;

import java.io.*;
public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");
        try {
        File f = new File("test190.txt");
        FileInputStream fis = new FileInputStream(f);
    } catch (FileNotFoundException e) {
        System.out.println("Exception poiman");
        System.out.println("Value in block catch: " + a);
        return a;
    } finally {
        a.append("!!!!");
        System.out.println("This is block finally");
        System.out.println("Value in block finally: " + a);
    }
        return a;
}

    public static void main(String[] args) {
        System.out.println(abc());
    }
}


