package annotation;

import java.lang.annotation.*;

public class Test1 {
    public static void main(String[] args) {
        Class xiaomiClass = Xiaomi.class;
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("Annotation info from Xiaomi class: " + smartPhone.OS() + ", " + smartPhone.yearOfCompanyCreation());

        Class iphoneClass = Iphone.class;
        Annotation annotation1 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Iphone class: " + smartPhone1.OS() + ", " + smartPhone1.yearOfCompanyCreation());
    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}
@SmartPhone()
class Xiaomi {
    String model;
    double price;
}
@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
