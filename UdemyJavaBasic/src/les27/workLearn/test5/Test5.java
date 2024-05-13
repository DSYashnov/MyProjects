package les27.workLearn.test5;

public class Test5 {
    static void abc(){
        System.out.println("Rabotaet method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e){
            System.out.println("Error poiman");
        }
    }
}
