package com.nishan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

        List<Employee> employeeList1 = getEmployees();
        System.out.println("-----------Before Sorting List--------------\n" + employeeList1);

        /**** Anonymous Class (Old Way) ****/
        Comparator<Employee> comparator1 = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return new Integer(emp1.getAge()).compareTo(new Integer(emp2.getAge()));
            }
        };

        /*** Sorting the Employee List Using Comparator By Age ****/
        Collections.sort(employeeList1, comparator1);
        System.out.println("-------------After Sorting list Using Anonymous Class-------------");
        System.out.println(employeeList1);

        List<Employee> employeeList2 = getEmployees();

        /**** Lambda Expression from Java8 ****/
        Comparator comparator2 = Comparator.comparing(Employee ::getAge);


        /*** Sorting the Employee List Using Comparator By Age ****/
        Collections.sort(employeeList2, comparator2);
        System.out.println("---------------After Sorting List Using Lambda Expression From Java8--------------");
        System.out.println(employeeList2);
    }

    /**** Helper Method #1 - This Method Prepares The Dummy Employee List ****/
    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(105, "Harry", 28));
        employees.add(new Employee(108, "Daniel", 35));
        employees.add(new Employee(110, "Lucifer", 40));
        employees.add(new Employee(102, "April", 25));
        employees.add(new Employee(104, "Toby", 22));
        return employees;
    }
}
