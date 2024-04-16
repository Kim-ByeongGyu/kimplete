package com.example.day0416.employee;

import java.util.HashSet;
import java.util.Set;

class EmployeeManager {
    private Set<Employee> employees;

    public EmployeeManager() {
        employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            System.out.println("이미 등록된 사원입니다.");
        } else {
            employees.add(employee);
            System.out.println("사원 추가: " + employee.getName());
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.remove(employee)) {
            System.out.println("사원 삭제: " + employee.getName());
        } else {
            System.out.println("삭제할 사원이 등록되어 있지 않습니다.");
        }
    }

    public void findEmployee(String id) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println("사원 정보: " + employee.getName() + ", " + employee.getId() + ", " + employee.getDepartment());
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당하는 아이디의 사원을 찾을 수 없습니다.");
        }
    }
}
