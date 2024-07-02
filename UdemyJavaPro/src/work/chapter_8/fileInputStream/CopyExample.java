package work.chapter_8.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\syash\\Desktop\\Логотип_Java.png");
             FileOutputStream fileOutputStream = new FileOutputStream("java_pic.png");
                ) {
            int i;
            while((i = inputStream.read()) !=-1){
                fileOutputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
