<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<h1 style="color: maroon; text-align: center; background-color: orange;">Employee
	Registration Form</h1>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form commandName="empCmd">
	<table bgcolor="cyan" align="center">
		<tr>
			<th>EmployeeNo::</th>
			<th><form:input path="empNo" /></th>
		</tr>
		<tr>
			<th>EmployeeName::</th>
			<th><form:input path="ename" /></th>
		</tr>
		<tr>
			<th>job::</th>
			<th><form:input path="job" /></th>
		</tr>
		<tr>
			<th>DateOfBirth::</th>
			<th><form:input path="dob" /></th>
		</tr>
		<tr>
			<th>DOJ::</th>
			<th><form:input path="doj" /></th>
		</tr>
		<tr>
			<th>DOM::</th>
			<th><form:input path="dom" /></th>
		</tr>
		<tr>
			<th colspan="2"><input type="submit" value="Register" /></th>
		</tr>
	</table>
</form:form>
<br>
<br>
<br>
<!-- Display form details -->
<h3 style="color: green;text-align: center;">Dear <span
	style="color: fuchsia; text-decoration: underline; font-family: sans-serif; font: bold;">${empCmd.ename}</span>
you have successfuly register with us.</h3><br><br>
<font style="color: blue; text-align: center; text-align: center;" face="sans-serif">
	EmployeeNo: ${empCmd.empNo}<br> EmployeeName:${empCmd.ename}<br>
	EmployeeJOB: ${empCmd.job } <br> EmployeeDOB: ${empCmd.dob} <br>
	EmployeeDOJ: ${empCmd.doj} <br> EmployeeDOM: ${empCmd.dom} <br>
</font>