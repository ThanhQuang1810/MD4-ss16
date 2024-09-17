package org.example.baitap3.services;

import org.example.baitap3.models.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    public EmployeeService() {
        employees.add(new Employee(1, "abc", "abc", "1234567890", true));
        employees.add(new Employee(2, "def", "def", "9876543210", false));
        employees.add(new Employee(3, "ghi", "ghi", "3210987654", true));
        employees.add(new Employee(4, "qwe", "qwe", "6437563243", true));
    }

    public List<Employee> getAll() {
        return employees;
    }

    public Employee getById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void update(int id, Employee employee) {
        Employee oldEmployee = getById(id);
        if (oldEmployee != null) {
            oldEmployee.setName(employee.getName());
            oldEmployee.setAddress(employee.getAddress());
            oldEmployee.setPhone(employee.getPhone());
            oldEmployee.setStatus(employee.isStatus());
        }
    }

    public void delete(int id) {
        employees.removeIf(e -> e.getId() == id);
    }
}
