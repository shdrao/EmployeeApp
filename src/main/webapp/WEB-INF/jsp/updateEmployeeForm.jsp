<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
<form:form action="/employeeapp/editEmployee" method="post" modelAttribute="employee">
<form:label path="employeeId" readonly="readonly">EmployeeId"</form:label>
<form:input path="employeeId"/>

<form:label path="employeeName">EmployeeName"</form:label>
<form:input path="employeeName"/>

<form:label path="employeeDepartment">EmployeeDepartment"</form:label>
<form:input path="employeeDepartment"/>

<form:label path="employeeSalary">EmployeeSalary"</form:label>
<form:input path="employeeSalary"/>
<input type="submit" name="Update">

</form:form>
</body>
</html>