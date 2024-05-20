package chapter_1.comparator.test1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee emp1 = new Employee(100, "Stanislav", "Yashnov", 122374);
        Employee emp2 = new Employee(103, "Sarah", "Sidorov", 1274);
        Employee emp3 = new Employee(102, "Sarah", "Petrov", 12324);
        list.add  (emp1);
        list.add  (emp2);
        list.add  (emp3);
        System.out.println("before sort\n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("after sort\n" + list);

    }
}
class Employee implements Comparable<Employee>{
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
    int id;
    String name;
    String surname;
    int salary;

    @Override
    public int compareTo(Employee anotherEmp) {
        if(this.id == anotherEmp.id){
            return 0;
        }
        else if(this.id<anotherEmp.id){
            return -1;
        }
        else {
            return 1;
        }
////        return this.id - anotherEmp.id;
////        return this.id.compareTo(anotherEmp.id);
////       int res = this.name.compareTo(anotherEmp.name);
////       if (res == 0) {
////           res = this.surname.compareTo(anotherEmp.surname);
////       }
////       return res;
////    }
    }
}
//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//                if(emp1.id == emp2.id){
//            return 0;
//        }
//        else if(emp1.id<emp2.id){
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }
//}
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}


