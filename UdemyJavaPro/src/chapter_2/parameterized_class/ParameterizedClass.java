package chapter_2.parameterized_class;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info = new Info<String>("Hello World");
        System.out.println(info);
        String s = info.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i = info2.getValue();
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

    public T getValue() {
        return value;
    }
}
