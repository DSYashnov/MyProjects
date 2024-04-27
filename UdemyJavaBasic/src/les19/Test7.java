package les19;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = { 0, 6, 4, 1};
        for (int i : arr){
            i = 3;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
