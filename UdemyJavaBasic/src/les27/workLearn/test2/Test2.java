package les27.workLearn.test2;

public class Test2 {
    void abc() throws ArrayIndexOutOfBoundsException{
        String s = null;
        System.out.println(s.length());
    }


    public static void main(String[] args) {
        int [] arr = {1, 4, 0};
        if (2 > 0 && 2 < arr.length){
            System.out.println(arr[2]);
        }
    }
}
