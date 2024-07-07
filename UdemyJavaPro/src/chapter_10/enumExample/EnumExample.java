package chapter_10.enumExample;

public class EnumExample {
    void method(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }
    public static void main(String[] args) {
        EnumExample e = new EnumExample();
        e.method("Monday");
    }
}
