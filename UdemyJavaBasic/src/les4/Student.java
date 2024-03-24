package les4;

import java.security.spec.RSAOtherPrimeInfo;

public class Student {

    int numberTicket;
    String firstName;
    String lastName;
    int yearsStudy;
    double mathRating;
    double economicRating;
    double languageRating;

    double studentRating(Student st){
        double sredOcenka = (st.economicRating + st.languageRating + st.mathRating) / 3;
        System.out.println("Srednyaa ochenka: " + st.firstName + " " +  sredOcenka);
        return sredOcenka;
    }

}
