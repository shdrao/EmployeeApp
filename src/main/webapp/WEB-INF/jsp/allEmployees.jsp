<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All employee details</title>
</head>
<body>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
			<th>Employee Salary</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<tbody>
			<c:forEach var="employee" items="${allEmployees}">
				<tr>
					<td>${employee.employeeId}</td>
					<td>${employee.employeeName}</td>
					<td>${employee.employeeDepartment}</td>
					<td>${employee.employeeSalary}</td>
					<td><a href="editEmployeePage/${employee.employeeId}">Edit</a><br></td>
					<td><a href="deleteEmployee/${employee.employeeId}">Delete</a><br></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>