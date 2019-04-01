<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!--  import spring tagLib -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: blue; text-align: center;">Student Registration
	Form</h1>


<form:form commandName="studCmd">
	<table align="center" >
		<tr>
			<th>Name::</th>
			<th><form:input path="sname" /></th>
		</tr>
		<tr>
			<th>Address::</th>
			<th><form:input path="addr" /></th>
		</tr>
		<tr>
			<th>Gender::</th>
			<th><form:radiobuttons path="gender" items="${genders}"/></th>
		</tr>
		<tr>
		    <th>Country::</th>
		    <th><form:select path="country">
		           <form:options items="${countries}"/>
		         </form:select>
		    </th>
		</tr>
		  <tr>
		   <th>Courses::</th>
		   <th>
		      <form:select path="courses">
		         <form:options items="${courses}"/>
		      </form:select>
		   </th>
		</tr>
		<tr>
		   <th>Hobies::</th>
		   <th>
		      <form:checkboxes items="${hobies}" path="hobies"/>
		   </th>
		</tr>
		<tr>
		   <th colspan="2"><input type="submit" value="Submit"></th>
		</tr>
	</table>
</form:form>









