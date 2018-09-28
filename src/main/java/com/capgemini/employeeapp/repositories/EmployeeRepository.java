package com.capgemini.employeeapp.repositories;

import java.util.List;


import com.capgemini.employeeapp.entities.Employee;

public interface EmployeeRepository {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int emplyeeId);
	public Employee findEmployeeById(int employeeId);
	public List<Employee> findAllEmployees();
}
