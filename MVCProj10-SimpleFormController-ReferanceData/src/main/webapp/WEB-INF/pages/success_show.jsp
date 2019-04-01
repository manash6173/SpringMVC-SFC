<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 style="color: navy; text-align: center;">
	Dear <span style="color: aqua;"> ${cmd.sname} </span>you have
	successfully register your form with the given details
</h2>
<br>
<font size="10" face="sans serif" >
<table align="center" width="300" height="100">
	<tr>
		<th style="color: maroon">Name:</th>
		<th style="color: blue">  ${cmd.sname}</th>
	</tr>
	<tr>
		<th style="color: maroon">Address:</th>
		<th style="color: blue">  ${cmd.addr}</th>
	</tr>
	<tr>
		<th style="color: maroon">Gender:</th>
		<th style="color: blue">  ${cmd.gender}</th>
	</tr>
	<tr>
		<th style="color: maroon">Country:</th>
		<th style="color: blue">  ${cmd.country}</th>
	</tr>
	<tr>
		<th style="color: maroon">Courses:</th>
		<th style="color: blue">  <c:forEach var="course" items="${cmd.courses}">
				<c:out value="${course}," />
			</c:forEach>
	    </th>
	</tr>
	<tr>
		<th style="color: maroon">Hobbies:</th>
		<th style="color: blue">  <c:forEach var="hobie" items="${cmd.hobies}">
				<c:out value="${hobie}," />
			</c:forEach>
	    </th>
	</tr>
</table>
</font>
<a href="register.htm">Home</a>
