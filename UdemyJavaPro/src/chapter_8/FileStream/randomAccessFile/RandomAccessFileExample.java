package chapter_8.FileStream.randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test1.txt", "rw")){
            int a = file.read();
            System.out.println((char)a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long posotion = file.getFilePointer();
            System.out.println(posotion);

//            file.seek(0);
//            file.writeBytes("hello");

            file.seek(file.length() -1);
            file.writeBytes("\t\t\t\t\t\tWilliam Butler");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

