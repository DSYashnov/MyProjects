package les19;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Bye");
        StringBuilder sb3 = new StringBuilder("Ok");
        StringBuilder[] arr = {sb1, sb2, sb3};
        for (StringBuilder i : arr){
            i.append("Java");
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
