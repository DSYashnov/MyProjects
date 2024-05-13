package les27.test2;

public class Test2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        String s = null;
        try {
            System.out.println(s.length());
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("hello");
        }
        System.out.println("Hello");
    }
}
