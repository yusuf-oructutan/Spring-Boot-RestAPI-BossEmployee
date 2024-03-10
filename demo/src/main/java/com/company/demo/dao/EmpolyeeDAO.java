package com.company.demo.dao;

import com.company.demo.entity.Employee;

import java.util.List;

public interface EmpolyeeDAO {


    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);



}
