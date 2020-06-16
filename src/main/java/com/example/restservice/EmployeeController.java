package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    List<Employee> allEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping("/employees/{id}")
    Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}