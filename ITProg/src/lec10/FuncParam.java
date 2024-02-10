package lec10;

public class FuncParam {
    public static void main(String[] args) {
        inf("Hello");
        String java = "Java";
        inf(java);
        inf("");
    }

    public static void inf(String word) {
        System.out.print(word);
        System.out.println("!");
    }
}
