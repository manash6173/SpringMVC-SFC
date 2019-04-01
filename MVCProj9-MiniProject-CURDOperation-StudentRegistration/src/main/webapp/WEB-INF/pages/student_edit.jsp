<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: maroon;text-align: center;">StudentRegistration Edit Form</h1><hr>
<body bgcolor="silver">
<form:form commandName="studCmd">
   <table style="color: navy" align="center" bgcolor="cyan" border="0">
     <tr>
        <th>REGISTERNO::</th><th><form:input path="regNo" disabled="true"/></th>
     </tr>
     <tr>
       <th>NAME::</th><th><form:input path="name"/></th>
     </tr>
     <tr>
       <th>ADDRESS::</th><th><form:input path="addr"/></th>
     </tr>
     <tr>
          <th>GENDER::</th>
         <th><form:radiobutton path="gender"  label="Male" value="M"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <form:radiobutton path="gender" label="Female" value="F"/></th>
      </tr>
     <tr>
       <th>COURSE::</th><th><form:input path="course"/></th>
     </tr>
     <tr>
       <th>MOBILENO::</th><th><form:input path="mobileNo"/></th>
     </tr>
     <tr>
       <th>EMAIL::</th><th><form:input path="email"/></th>
     </tr>
     <tr>
       <th colspan="2"><input type="submit" value="submit"/></th>
     </tr>
   </table>
   <a href="all_student.htm"><img src="home.jpg" width="120" height="60"></a>
</form:form>
</body>