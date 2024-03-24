package les12;

import java.util.Calendar;
import java.util.Date;

public class Tracker {
    public String getFirstName() {
        return firstName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private final String firstName;
    private final Date dateBirth;
    private final String mail;
    private final String phoneNumber;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStep(int step) {
        this.step = step;
    }

    private String lastName;
    private double weight;
    private String pressure;
    private int step;

    public Tracker(String firstName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String mail, String phoneNumber) {
        this.firstName = firstName;
        Calendar calendar = Calendar.getInstance();
        calendar.set(yearOfBirth, monthOfBirth -1, dayOfBirth);
        this. dateBirth = calendar.getTime();
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }
    public void printAccountInfo(){
        System.out.println("Name: " + firstName);
        System.out.println("Date of Birth: " + dateBirth);
        System.out.println("Email: " + mail);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("First name: " + lastName);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps per Day: " + step);
    }
    }

