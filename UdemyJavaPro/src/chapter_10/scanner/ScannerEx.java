package chapter_10.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        try {
            sc = new Scanner(new FileReader(new File("test11.txt")));
            sc.useDelimiter("\\W");
            while (sc.hasNext()) {
                String word = sc.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("we have a problem");
        }
        finally {
            sc.close();
        }
    }
}
