package les28.test16;

import java.io.*;
import java.util.ArrayList;

public class Test16 {
    static Doctor [] arr = new Doctor[4];
    public static void main(String[] args) {
         ArrayList<String> list;
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(3));
//        System.out.println(5/0);
//        Doctor doctor = new Doctor();
//        Teacher teacher = new Teacher();
//        Teacher teacher2 = new Teacher();
//        Teacher [] arr2 = {teacher, teacher2};
//        Employee[] arr = {doctor, teacher};
//        Teacher teacher1 = (Teacher) arr[0];
//        createPass("qwertyuiopsdsda");
//        list.add("!!!");
//        System.out.println(arr[0].toString());
        Integer.parseInt("44ab", 16);
    }

    // LinkageError
    public static void createPass(String pwd){
        if(pwd.length()<6){
            throw new IllegalArgumentException("Length in pass very small");
        }
        if(pwd.length()>12){
            throw new IllegalArgumentException("Length in pass very long");
        }
        System.out.println("Password is ok");
    }
}
class Employee{
}
class Doctor extends Employee{
}
class Teacher extends Employee{
}
//class AirBus{
//    String sostoyanie = "v ojidanii"; // v vozduhe, polet otmenen
//    public void fly(){
//        sostoyanie = "v vozduhe";
//        System.out.println("samolet letit");
//    }
//    public void ojidat(){
//        if(sostoyanie.equals("v vozduhe")){
//            throw new IllegalStateException("samolet uje v voduhe");
//        }
//        sostoyanie = "v ojidanii";
//        System.out.println("samolet v ojidanii poleta");
//    }
//    public void otmenitPolet(){
//        if(sostoyanie.equals("v vozduhe")){
//            throw new IllegalStateException("samolet uje v voduhe");
//        }
//        sostoyanie = "polet otmenen";
//        System.out.println("polet samoleta otmenen");
//    }
//
//    public static void main(String[] args) {
//        AirBus a = new AirBus();
//        a.ojidat();
//        a.fly();
//        a.otmenitPolet();
//    }
//}