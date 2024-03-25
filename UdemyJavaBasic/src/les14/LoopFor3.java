package les14;

public class LoopFor3 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            if (i == 87) {
                continue;
            }
            System.out.println(i);
        }
    }
}
