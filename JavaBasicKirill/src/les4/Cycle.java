package les4;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value: ");
        int action = s.nextInt();
        int count = 0;
        int i = 0;
        float time = 5;
        float afterTheApproach = 60;
        float count2 = 0;
        double count3 = 0;

        while(i != action){
            System.out.println(i + 1);
            float time2 = time * (i + 1);
            double time3 = afterTheApproach + afterTheApproach * 0.2 * i;
            count3 += time3;
            count2 += time2;
            System.out.println("Потрачено времени на подход: " + time2 + " sec");
            i++;
            count += i;
        }
        System.out.println("----------------------");
        int totalMinutes = (int) count2 / 60;
        int totalSeconds = (int) count2 % 60;
        System.out.println("Всего времени потрачено: " + totalMinutes + " мин " + totalSeconds + " сек");
        System.out.println("Всего подтягиваний: " + count);
        totalMinutes = (int) count3 / 60;
        totalSeconds = (int) count3 % 60;
        System.out.println("Общее время отдыха: " + totalMinutes + " мин " + totalSeconds + " сек");
    }
}
