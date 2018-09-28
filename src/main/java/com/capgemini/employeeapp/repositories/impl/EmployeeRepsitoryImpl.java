package com.capgemini.employeeapp.repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.capgemini.employeeapp.entities.Employee;
import com.capgemini.employeeapp.repositories.EmployeeRepository;

@Repository
public class EmployeeRepsitoryImpl implements EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Employee addEmployee(Employee employee) {
		int count = jdbcTemplate.update("INSERT into employee values(?,?,?,?)", 
				new Object[] { employee.getEmployeeId(),
				employee.getEmployeeName(), employee.getEmployeeDepartment(), 
				employee.getEmployeeSalary() });
		if (count != 0)
			return employee;
		return null;
	}

	public Employee updateEmployee(Employee employee) {
		int count = jdbcTemplate.update(
				"UPDATE employee SET employee_Name=?, employee_Department=?, "
				+ "employee_Salary=? WHERE employee_Id=?",
				new Object[] { employee.getEmployeeName(), employee.getEmployeeDepartment(),
						employee.getEmployeeSalary(), employee.getEmployeeId() });
		if (count != 0)
			return employee;
		return findEmployeeById(employee.getEmployeeId());
	}

	public boolean deleteEmployee(int employeeId) {
		int count = jdbcTemplate.update("DELETE from employee where employee_Id=?", 
				new Object[] { employeeId });
		if (count != 0)
			return true;
		return false;
	}

	public List<Employee> findAllEmployees() {
		return jdbcTemplate.query("SELECT * FROM employee", new Object[] {}, 
				new EmployeeRowMapper());
	}

	public Employee findEmployeeById(int employeeId) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee where employee_Id=?", 
				new Object[] { employeeId },
				new EmployeeRowMapper());
	}

	private class EmployeeRowMapper implements RowMapper<Employee> {

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setEmployeeDepartment(rs.getString(3));
			employee.setEmployeeId(rs.getInt(1));
			employee.setEmployeeName(rs.getString(2));
			employee.setEmployeeSalary(rs.getDouble(4));
			return employee;
		}

	}

}
