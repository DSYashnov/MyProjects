package lec7;

public class ClassBreak {
    public static void main(String[] args) {
        for (int i = 5; i < 25; i += 2) {
            if (i >= 17)
                break;
            System.out.println("Element: " + i);
        }
    }

}
