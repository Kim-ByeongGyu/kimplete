package com.example.day0416;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    Set<Employee> employees = new HashSet<>();

    void addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            System.out.println("이미 있는 사원입니다.");
        } else {
            employees.add(employee);
            System.out.println(employee);
            System.out.println("추가되었습니다.");
        }
    }
    void findEmployee(String id) {
        for (Employee employee: employees) {
            if (employee.getId().equals(id)) {
                System.out.print("찾는 사원 >> ");
                System.out.println(employee);
                return;
            }
        }
        System.out.println("찾으시는 아이디의 사원은 없습니다.");
    }
    void removeEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("제거되었습니다.");
        } else {
            System.out.println("해당 사원은 없습니다.");
        }
    }
}
