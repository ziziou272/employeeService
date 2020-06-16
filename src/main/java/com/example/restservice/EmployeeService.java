package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//这个不光可以和database 对接，还可以处理cache
@Service
public class EmployeeService {
    //dependency injection ->不需要知道具体的实现，只需要有这个 repo
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee found = employeeRepository.findById(id).orElse(null);
        if (found == null) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        found.setName(employee.getName());
        found.setRole(employee.getRole());
        employeeRepository.save(found);
        return found;
    }





}
