package les6.homework.Student;

public class Student {

    int id;
    String firstName;
    String lastName;
    int yearsStudy;
    double mathRating;
    double economicRating;
    double languageRating;

    Student (int id1, String firstName1, String lastName1, int yearsStudy1, double mathRating1, double economicRating1, double languageRating1){
        id = id1;
        firstName = firstName1;
        lastName = lastName1;
        yearsStudy = yearsStudy1;
        mathRating = mathRating1;
        economicRating = economicRating1;
        languageRating = languageRating1;
    }

    Student (int id2, String firstName2, String lastName2, int yearsStudy2){
        this (id2,firstName2,lastName2, yearsStudy2, 0.0, 0.0,0.0);
    }
    Student (){

    }
}

