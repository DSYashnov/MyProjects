package chapter_2.parameterized_class;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info = new Info<String>("Hello World");
        System.out.println(info);
    }
}
class Info<T>{
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }
}
