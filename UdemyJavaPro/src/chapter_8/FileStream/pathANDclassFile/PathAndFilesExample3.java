package chapter_8.FileStream.pathANDclassFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesExample3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Hello\n-Hello!!!\n-How are you?\n-I`m ok!\n-And you?\n-I`m to!";
//        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String line : list) {
            System.out.println(line);
        }
    }
}
