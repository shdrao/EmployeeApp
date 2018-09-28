<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee Form</title>
</head>
<body>
<form:form action="addEmployee" method="post" modelAttribute="employee">
<form:label path="employeeId">EmployeeId</form:label>
<form:input path="employeeId"/>

<form:label path="employeeName">EmployeeName</form:label>
<form:input path="employeeName"/>

<form:label path="employeeDepartment">EmployeeDepartment</form:label>
<form:input path="employeeDepartment"/>

<form:label path="employeeSalary">EmployeeSalary</form:label>
<form:input path="employeeSalary"/>
<input type="submit" name="Add new employee">

</form:form>
</body>
</html>