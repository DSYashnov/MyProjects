package les18.homeworkMistakes;

public class Exercise1 {
    public static int[] sortirivka (int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            if (index != i) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = sortirivka(new int[]{17, 62, 43, 14, 25, 62, 7, 83, 9, 3});
        sortirivka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
