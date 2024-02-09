package lec7;

public class CycleFor {
    public static void main(String[] args) {
        for (float i = 100; i > 0; i /= 2) {
            System.out.println("element: " + i);
        }
    }
}
