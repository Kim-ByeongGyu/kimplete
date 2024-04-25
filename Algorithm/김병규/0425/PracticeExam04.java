package com.example.day0425;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class PracticeExam04 {
    public static void main(String[] args) {
        // 실습 문제 4: 직원 관리
        // 직원 객체의 리스트에서 각 부서(department)별로 평균 급여를 계산하시오.
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((department, avg) -> System.out.println(department + " : " + avg));
    }
}
