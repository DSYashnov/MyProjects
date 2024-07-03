package chapter_8.FileStream.fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("test2.txt");
        FileWriter fw = new FileWriter("test2.txt", true);) {
            int character;
            while((character = fr.read())!=-1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        }
    }
}
