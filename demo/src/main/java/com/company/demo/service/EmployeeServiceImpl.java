package com.company.demo.service;

import com.company.demo.dao.EmpolyeeDAO;
import com.company.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmpolyeeDAO empolyeeDAO;



    @Autowired
    public EmployeeServiceImpl(EmpolyeeDAO empolyeeDAO) {
        this.empolyeeDAO = empolyeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return empolyeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return empolyeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return empolyeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {

        empolyeeDAO.deleteById(theId);
    }
}
