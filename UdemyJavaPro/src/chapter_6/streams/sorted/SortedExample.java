package chapter_6.streams.sorted;

import java.util.Arrays;

public class SortedExample {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
