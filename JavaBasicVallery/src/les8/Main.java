package les8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] team1Ages = new int[25];
        int[] team2Ages = new int[25];

        for (int i = 0; i < 25; i++) {
            team1Ages[i] = random.nextInt(23) + 18;
            team2Ages[i] = random.nextInt(23) + 18;
        }
        System.out.print("Вік граців команди 1: ");
        for (int age : team1Ages) {
            System.out.print(age + ", ");
        }
        System.out.println(" ");
        System.out.print("Вік граців команди 2: ");
        for (int age : team2Ages) {
            System.out.print(age + ", ");
        }

        double team1AverageAges = calculateAverage(team1Ages);
        double team2AverageAges = calculateAverage(team2Ages);
        System.out.println(" ");
        System.out.println("Середній вік команди 1: " + team1AverageAges);
        System.out.println("Середній вік команди 2: " + team2AverageAges);
    }
        public static double calculateAverage(int[] ages){
            int sum = 0;
            for (int age : ages) {
                sum += age;
            }
            return (double) sum / ages.length;
        }
    }




