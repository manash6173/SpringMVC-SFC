<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color: red;text-align: centr">MultiActionController</h1>
  <form action="submit.htm" method="POST">
     Employee No::<input type="text" name="eno"/>      <br>
     Employee Name::<input type="text" name="ename"/>  <br>
     Employee Job::<input type="text" name="job"/>     <br>
     Employee Salary::<input type="text" name="sal"/>  <br>
          <input type="submit" value="insert" name="s1"/>
          <input type="submit" value="update" name="s1"/>
          <input type="submit" value="delete" name="s1"/>
          <input type="submit" value="view" name="s1"/>
  </form>
  
  <c:if test="${!empty operation}">
    ${operation} is performed 
  </c:if>
  
 