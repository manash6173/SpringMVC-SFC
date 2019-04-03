<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 style="color: red;text-align: centr">MultiActionController</h1>
  <form name="frm" method="POST">
     Employee No::<input type="text" name="eno"/>      <br>
     Employee Name::<input type="text" name="ename"/>  <br>
     Employee Job::<input type="text" name="job"/>     <br>
     Employee Salary::<input type="text" name="sal"/>  <br>
          <input type="button" value="insert" onclick="perform(this.value)"/>
          <input type="button" value="update" onclick="perform(this.value)"/>
          <input type="button" value="remove" onclick="perform(this.value)"/>
          <input type="button" value="view"   onclick="perform(this.value)"/>
  </form>
  
  
  <c:if test="${!empty operation}">
    ${operation} is performed 
  </c:if>
  
  <script type="text/javascript">
  function perform(name){
  	alert(name);
  	
  	if(name=='insert')
  		frm.action="insert.htm";
  	else if(name=='update')
  	    frm.action="update.htm";
  	else if(name=='remove')
  		frm.action="remove.htm";
  	else
  		frm.action="view.htm";
  	frm.submit();	
  }
  
  </script>

 