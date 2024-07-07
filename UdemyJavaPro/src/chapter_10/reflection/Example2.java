package chapter_10.reflection;

import java.lang.reflect.Field;

public class Example2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee emp = new Employee(10, "Stanislav", "IT");
        Class empClass = emp.getClass();
        Field field = empClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(emp);
        System.out.println(salaryValue);

        field.set(emp, 1500);
        System.out.println(emp);
    }
}
