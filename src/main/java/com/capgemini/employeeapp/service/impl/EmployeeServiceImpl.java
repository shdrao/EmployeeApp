package com.capgemini.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeapp.entities.Employee;
import com.capgemini.employeeapp.repositories.EmployeeRepository;
import com.capgemini.employeeapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepository.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int emplyeeId) {

		return employeeRepository.deleteEmployee(emplyeeId);
	}

	@Override
	public Employee findEmployeeById(int employeeId) {

		return employeeRepository.findEmployeeById(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {

		return employeeRepository.findAllEmployees();
	}

}
