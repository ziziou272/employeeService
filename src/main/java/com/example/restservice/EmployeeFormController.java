package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller
public class EmployeeFormController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee_form")
    public String showForm() {
        return "EmployeeForm.html";
    }

    @PostMapping("/employee_form")
    public String saveEmployee(@Valid Employee employee, @NotNull BindingResult result) {
        if (result.hasErrors()) { return "error"; }
        employeeService.saveEmployee(employee);
        return "redirect:employees";
    }

}
