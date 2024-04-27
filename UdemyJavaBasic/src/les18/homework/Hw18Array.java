package les18.homework;

import java.util.Arrays;

public class Hw18Array {
    public static void sortirovka (int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 34, 34, 6, 6,573, 2, 3};
        sortirovka(arr);
    }
}
