package les27.test4;
import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test10.txt");

        try {
        FileInputStream fis = new FileInputStream(f);
            System.out.println("Good day all!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Bil poyman exception: " + e);
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Danniy kod uje ne imeet otnochenie k isklycheniyam");
    }
}
