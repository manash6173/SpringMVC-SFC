<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center;">Form Page3</h1>
<br>
<br>
<br>
<form:form commandName="regCmd">
	 <table align="center" bgcolor="cyan">
		<tr>
			<th>CurrentSalary::</th>
			<th><form:input path="currentSal" /></th>
		</tr>
		<tr>
			<th>ExpectedSalary::</th>
			<th><form:input path="expectedSal" /></th>
		</tr>
		<tr>
			<th><input type="submit" name="_target1" value="PREV"></th>&nbsp;&nbsp;&nbsp;
			<th><input type="submit" name="_finish" value="FINISH"></th>&nbsp;&nbsp;&nbsp;
			<th><input type="submit" name="_cancel" value="CANCEL"></th>
		</tr>
	</table>
</form:form>