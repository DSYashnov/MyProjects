package lec6;

import java.util.Scanner;

public class TestProg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter password");
        String role = s.nextLine();
        System.out.println("Enter password");
        String pass = s.nextLine();
        if(role.equals("Admin") && pass.equals("12345")){
            System.out.println("All users");
        } else {
            System.out.println("Hello! what is your name?");
            String name = s.nextLine();
        }
    }
}
