package pro.sky.java.course2.maps.service;

import pro.sky.java.course2.maps.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    void addEmployee(String firstName, String lastName);
    void removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Map<String, Employee> getEmployees();
}
