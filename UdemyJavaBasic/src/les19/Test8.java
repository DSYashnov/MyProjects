package les19;

public class Test8 {
    public static void main(String[] args) {
        int [] arr = new int[4];
        for( int i = 0; i < arr.length; i++ ){
            arr[i] = i*10;
        }
        for( int i : arr){
            System.out.println(i + " ");
        }
    }
}
