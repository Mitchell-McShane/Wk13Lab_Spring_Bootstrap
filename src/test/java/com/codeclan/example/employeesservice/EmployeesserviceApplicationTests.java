package com.codeclan.example.employeesservice;

import com.codeclan.example.employeesservice.models.Employee;
import com.codeclan.example.employeesservice.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void canCreateEmployee(){
		Employee employee = new Employee("Maxwell", 6, 12345, "coolmax1@hotmail.com");
		employeeRepository.save(employee);
	}

	@Test
	void contextLoads() {
	}


}
