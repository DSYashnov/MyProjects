package les20;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int[] array1 = {18, 24, 457, 5, 6};

        char[] array2 = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] array3 = {'r', 'b', 'v', 'd', 'm', 'f'};

        System.out.println(Arrays.mismatch(array1, array));

        System.out.println(Arrays.mismatch(array2, array3));
    }
}
