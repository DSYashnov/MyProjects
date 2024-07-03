package chapter_8.FileStream.tryWithResources;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                        "Непонятного нет для меня под луной.\n" +
                        "Мне известно, что мне ничего не известно!\n" +
                        "Вот последняя правда, открытая мной.";
        String s = "hello";
        try (FileWriter fw = new FileWriter("test2.txt", true)){
            for (int i = 0; i < rubai.length(); i++) {
                fw.write(rubai.charAt(i));
            }
            fw.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
