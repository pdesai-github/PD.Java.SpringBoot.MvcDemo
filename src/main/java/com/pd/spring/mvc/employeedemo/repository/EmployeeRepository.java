package com.pd.spring.mvc.employeedemo.repository;

import com.pd.spring.mvc.employeedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
