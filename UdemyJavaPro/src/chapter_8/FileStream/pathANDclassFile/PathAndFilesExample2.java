package chapter_8.FileStream.pathANDclassFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesExample2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Admin\\Desktop\\N");
        Path directoryAPath = Paths.get("C:\\Users\\Admin\\Desktop\\N");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        //Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        Files.copy(directoryAPath, directoryPath.resolve("A"));
//        System.out.println("Done!");

        //Files.move(filePath, directoryPath.resolve("test15.txt"));
        //Files.move(Paths.get("test2.txt"), (Paths.get("test11.txt")));
        Files.delete(Paths.get("C:\\Users\\Admin\\Desktop\\N"));
    }
}
