<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center;">Form Page2</h1>
<br>
<br>
<br>
<form:form commandName="regCmd">
	 <table align="center" bgcolor="cyan">
		<tr>
			<th>Domain::</th>
			<th><form:input path="domain" /></th>
		</tr>
		<tr>
			<th>Location::</th>
			<th><form:input path="location" /></th>
		</tr>
		<tr>
			<th>Experience::</th>
			<th><form:input path="experience" /></th>
		</tr>
		<tr>
			<th><input type="submit" name="_target0" value="PREV"></th>&nbsp;&nbsp;
			<th><input type="submit" name="_target2" value="NEXT"></th>&nbsp;&nbsp;
			<th><input type="submit" name="_cancel" value="CANCEL"></th>
		</tr>
	</table>
</form:form>