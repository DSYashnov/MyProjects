package chapter_3.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(-30);
        list.add(19);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("--------------");

        Employee emp1 = new Employee(100, "Stanislv", 1000);
        Employee emp2 = new Employee(15, "Mike", 800);
        Employee emp3 = new Employee(123, "Jack", 900);
        Employee emp4 = new Employee(15, "John", 1100);
        Employee emp5 = new Employee(182, "Nick", 1200);
        Employee emp6 = new Employee(15, "Daniel", 1400);
        Employee emp7 = new Employee(250, "Mary", 500);
        List<Employee> list1 = new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        list1.add(emp5);
        list1.add(emp6);
        list1.add(emp7);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        int index2 = Collections.binarySearch(list1, new Employee(15, "John", 1100));
        System.out.println(index2);

        System.out.println("--------------");
        int [] arr = {-3, 8, 12, -8, 0, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index3 = Arrays.binarySearch(arr, 150);
        System.out.println(index3);
    }
}
class Employee implements Comparable<Employee> {
    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
