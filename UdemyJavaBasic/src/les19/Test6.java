package les19;

public class Test6 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5},{7, 8, 9, 6, 7, 3}};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
        for (int [] arr2 : arr){
            for(int a : arr2){
                System.out.print(a + " ");
            }
        }
    }
}
