package com.pd.spring.mvc.employeedemo.controller;

import com.pd.spring.mvc.employeedemo.model.Employee;
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

    @GetMapping
    public String getAllEmployees(Model model) {
        // Create mock employee data
        List<Employee> employees = Arrays.asList(
                new Employee(UUID.randomUUID(), "Alice", 50001.0),
                new Employee(UUID.randomUUID(), "Bob", 60001.0),
                new Employee(UUID.randomUUID(), "Charlie", 55000.0)
        );
        model.addAttribute("employeeList", employees);
        return "employee-list";
    }

}
