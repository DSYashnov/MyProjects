package les18.homework;

public class Hw18_2 {
    public static void showArray(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       String[][] arr = {{"a", "b", "c"}, {"d", "e", "f"}};
       showArray(arr);
    }
}
