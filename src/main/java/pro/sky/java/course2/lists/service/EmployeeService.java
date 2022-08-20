package pro.sky.java.course2.lists.service;

import pro.sky.java.course2.lists.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(String firstName, String lastName);
    void removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    List<Employee> getEmployees();
}
