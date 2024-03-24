package les4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите название первой команды: ");
        String command1 = s.nextLine();
        System.out.print("Введите название вотрой команды: ");
        String command2 = s.nextLine();
        System.out.println("Введите количество фрагов для каждого игрока команды");

        System.out.print("Количество фрагов игрока 1 команды 1: ");
        int player1 = s.nextInt();
        System.out.print("Количество фрагов игрока 2 команды 1: ");
        int player2 = s.nextInt();
        System.out.print("Количество фрагов игрока 3 команды 1: ");
        int player3 = s.nextInt();
        System.out.print("Количество фрагов игрока 4 команды 1: ");
        int player4 = s.nextInt();
        System.out.print("Количество фрагов игрока 5 команды 1: ");
        int player5 = s.nextInt();


        System.out.println("Введите количество фрагов для каждого игрока команды");
        System.out.print("Количество фрагов игрока 1 команды 2: ");
        int player1_2 = s.nextInt();
        System.out.print("Количество фрагов игрока 2 команды 2: ");
        int player2_2 = s.nextInt();
        System.out.print("Количество фрагов игрока 3 команды 2: ");
        int player3_2 = s.nextInt();
        System.out.print("Количество фрагов игрока 4 команды 2: ");
        int player4_2 = s.nextInt();
        System.out.print("Количество фрагов игрока 5 команды 2: ");
        int player5_2 = s.nextInt();

        int resultCommand1 = (player1 + player2 + player3 + player4 + player5) / 5;
        System.out.println("Среднее арифметичское количество фрагов команды 1: " + resultCommand1);

        int resultCommand2 = (player1_2 + player2_2 + player3_2 + player4_2 + player5_2) / 5;
        System.out.println("Среднее арифметичское количество фрагов команды 2: " + resultCommand2);

        if (resultCommand1 > resultCommand2) {
            System.out.println("Команда победитель " + command1 + " набрав " + resultCommand1 + " очков");
        } else {
            System.out.println("Команда победитель " + command2 + " набрав " + resultCommand2 + " очков");
        }
    }
}
