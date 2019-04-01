<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<h1 style="color: maroon;text-align: center;">Student Registration Form</h1>

<script type="text/javascript" src="validate.js"></script>
<form:form method="POST" commandName="studCmd" onsubmit="return validate(this)">
  <table align="center" bgcolor="cyan" style="color: red;text-align: center;">
      <tr>
         <th>Name::</th>
         <th><form:input path="name"/></span></th><td><span id="nameError"></span></td><td><form:errors path="name"/></td>
      </tr>
      <tr>
         <th>Address::</th>
         <th><form:input path="addr"/><td><span id="addrError"></span></td></th><td><form:errors path="addr"/></td>
      </tr>
      <tr>
          <th>Gender::</th>
         <th><form:radiobutton path="gender"  label="Male" value="M"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <form:radiobutton path="gender" label="Female" value="F"/></th>
      </tr>
      <tr>
         <th>Course::</th>
         <th><form:input path="course"/><td><span id="courseError"></span></td></th><td><form:errors path="course"/></td>
      </tr>
      <tr>
         <th>MobileNumber::</th> 
         <th><form:input path="mobileNo"/><td><span id="mobError"></span></td></th><td><form:errors path="mobileNo"/></td>
      </tr>
      <tr>
         <th>Email::</th>
         <th><form:input path="email"/><td><span id="emailError"></span></td></th><td><form:errors path="email"/></td>
      </tr>
      <tr>
        <th>
          <form:hidden path="vflag"/>
        </th>
      </tr>
      <tr>
         <th><input type="submit"  background-image:url('submit.jpg') 10px 10px no-repeat/></div></th>
         <th><input type="reset" value="Clear"></th>
      </tr>
  </table>
  <a href="all_student.htm"><img src="home.jpg" title="Home" width="120" height="60"></a>
</form:form>