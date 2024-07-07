package chapter_10.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //Class employeeClass = Class.forName("reflection.Employee");
        Class employeeClass = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass1 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("****************");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getType() + " field = " + field.getName());
        }
        System.out.println("****************");

        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getType() + " field = " + field.getName());
        }
        System.out.println("****************");

        Method someMethod = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of someMethod = " + someMethod.getReturnType() + " parameterTypes = " + Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("****************");

        Method someMethod1 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of someMethod = " + someMethod1.getReturnType() + " parameterTypes = " + Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("****************");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("name of methods = " + method.getName() +
                    " Return type = "
                    + method.getReturnType() +
                    " parameterTypes = "
                    + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("****************");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("name of methods = " + method.getName() +
                    " Return type = "
                    + method.getReturnType() +
                    " parameterTypes = "
                    + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("****************");
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.println("name of methods = " + method.getName() +
                        " Return type = "
                        + method.getReturnType() +
                        " parameterTypes = "
                        + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("****************");
        Constructor constructor = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        System.out.println("****************");
        Constructor constructorParam = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructorParam.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructorParam.getParameterTypes()));
        System.out.println("****************");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor allConstructor : constructors) {
            System.out.println("Constructor " + allConstructor.getName() +
                    " has " + allConstructor.getParameterCount() + " parameters, their types are: " + Arrays.toString(allConstructor.getParameterTypes()));
        }
    }
}
