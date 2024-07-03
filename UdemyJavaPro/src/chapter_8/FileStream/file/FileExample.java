package chapter_8.FileStream.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\Admin\\Desktop\\A");
        System.out.println("file.GetAbsolutePath = " +  file.getAbsolutePath());
        System.out.println("folder.GetAbsolutePath = " +  folder.getAbsolutePath());
        System.out.println("----------------------------------------------");
        System.out.println("file.IsAbsolute = " +  file.isAbsolute());
        System.out.println("folder.IsAbsolute = " +  folder.isAbsolute());
        System.out.println("----------------------------------------------");
        System.out.println("file.IsDirectory = " +  file.isDirectory());
        System.out.println("folder.IsDirectory = " +  folder.isDirectory());
        System.out.println("----------------------------------------------");
        System.out.println("file.IsExist = " +  file.exists());
        System.out.println("folder.IsExist = " +  folder.exists());
        System.out.println("----------------------------------------------");
        System.out.println("file2.createNewFile = " +  file.createNewFile());
        System.out.println("folder2.mkdir = " +  folder.mkdir());
        System.out.println("----------------------------------------------");
        System.out.println("file2.length = " +  file.length());
        System.out.println("folder2.length = " +  folder.length());
        System.out.println("----------------------------------------------");
        System.out.println("folder2.delete = " +  folder.delete());
        System.out.println("----------------------------------------------");
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("----------------------------------------------");

    }
}
