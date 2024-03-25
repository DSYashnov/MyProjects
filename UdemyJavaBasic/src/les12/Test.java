package les12;

public class Test {
    void abc(){
        String str;
        int a = 10;
        if (a >= 10){
            str = "Hello!!";
        }
        if (a < 10){
            str = "Bye!";
        }
        else {
        str = null;
        }

        System.out.println(str);
    }

    void maximum(int i1, int i2, int i3){
        if (i1 > i2 && i1 > i3){
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Maximum - " + i2);
        } else {
            System.out.println("Maximum - " + i3);
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.maximum(4, 7, 0);
        t.abc();

        int a = 10;
        int b = 20;

        int max = (a > b) ? a:b;
        System.out.println(max);
    }
}
