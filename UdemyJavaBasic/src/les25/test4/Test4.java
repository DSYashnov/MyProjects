package les25.test4;

public class Test4 {
    public static void main(String[] args) {
        String [] arr1 = {"Hello", "Bye"};
        Object [] arr2 = arr1;
        String [] arr3 = (String[]) arr2;
        //arr3[0] = new StringBuilder("ok");
        arr2[0] = new StringBuilder("ok");
    }
}
