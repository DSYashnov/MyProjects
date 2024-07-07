package chapter_10.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Employee.class;

//        Employee o = (Employee)employeeClass.newInstance();
//        System.out.println(o);
        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee obj = constructor.newInstance();

        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj1 = constructor1.newInstance(5, "John", "IT");
        System.out.println(obj1);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj1, 800.88);
        System.out.println(obj1);
    }
}
