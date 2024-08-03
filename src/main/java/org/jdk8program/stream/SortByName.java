package org.jdk8program.stream;

import org.common.Database;
import org.common.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName {

    public static void main(String[] args) {
        List<Employee> emp = Database.getEmployeeDetails();
        List<Employee> employee = emp.stream().
                sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
                employee.forEach(System.out::println);
    }
}
