package les18;

public class ArraysTest {
    public static void maxMin (double[] array){
        double max = array[0];
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("minimalniy el mass " + min);
        System.out.println("maximalniy el mass " + max);
    }
    public static void main(String[] args) {
        double[] array = {1.05, 10, 4, 6, 65, 78};
        maxMin(new double[]{4, 5, 68, 5, 12});
    }
}
