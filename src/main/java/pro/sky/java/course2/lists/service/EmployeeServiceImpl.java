package pro.sky.java.course2.lists.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.lists.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>(List.of(
                new Employee("Станислав", "Лем"),
                new Employee("Борис", "Стругацкий"),
                new Employee("Роберт", "Шекли"),
                new Employee("Стивен", "Кинг"),
                new Employee("Эдгар", "Берроуз")
        ));
    }

    @Override
    public void addEmployee(String firstName, String lastName) {
        if (findEmployee(firstName, lastName) != null) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(new Employee(firstName, lastName));
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee employee = findEmployee(firstName, lastName);
        if ( employee == null) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(employee);
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        for (Employee employee:employees) {
            if (firstName.equals(employee.getFirstName()) && lastName.equals(employee.getLastName())) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }
}
