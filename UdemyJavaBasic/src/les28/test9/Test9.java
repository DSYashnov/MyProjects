package les28.test9;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test190.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman i  nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("This is block finally");

        }
    }
    void method() throws FileNotFoundException {
        abc();
    }
//    void def() {
//        try {
//            int [] arr = {1, 2, 3};
//            System.out.println(arr[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception poiman i  nemnogo obrabotan");
//            throw e;
//        } finally {
//            System.out.println("This is block finally");
//        }
//    }
}
