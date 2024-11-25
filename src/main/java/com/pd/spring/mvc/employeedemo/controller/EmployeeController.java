package com.pd.spring.mvc.employeedemo.controller;

import com.pd.spring.mvc.employeedemo.model.Employee;
import com.pd.spring.mvc.employeedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public String getAllEmployees(Model model) {
        // Create mock employee data
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);

        return "employee-list";
    }

}
