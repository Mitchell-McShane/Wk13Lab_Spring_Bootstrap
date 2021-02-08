package com.codeclan.example.employeesservice.controllers;

import com.codeclan.example.employeesservice.models.Employee;
import com.codeclan.example.employeesservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @PostMapping(value = "/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }
}
