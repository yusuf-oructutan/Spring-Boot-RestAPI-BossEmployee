package com.company.demo.service;

import com.company.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);



}
