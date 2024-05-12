package les28.test12;

import org.w3c.dom.ls.LSOutput;

public class Test12 {
    void abc() {
    int[] arr = {1, 2, 3};
    try {
        System.out.println(arr[7]);
    } catch(ArrayIndexOutOfBoundsException e) {
        String s = null;
        System.out.println(s.length());
    } catch (NullPointerException e) {
        System.out.println("Poiman NullPointerException");
    }
}
    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}
