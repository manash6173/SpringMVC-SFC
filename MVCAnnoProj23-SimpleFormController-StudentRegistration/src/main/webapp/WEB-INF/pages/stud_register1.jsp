<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<style>
   form{
     color:red;
   }
</style>

<h1 style="color: maroon;text-align: center;">Student Registration Form</h1>
<script type="text/javascript" src="validate.js"></script>
<form:form method="POST" commandName="studCmd" onsubmit="return validate()" name="frm">

   Name:: <form:input path="sname"/><span id="nameError"></span><form:errors path="sname"/><br>
   Address::  <form:input path="addr"/><span id="addrError"></span><form:errors path="addr"/><br>
   Gender::<form:radiobutton path="gender"  label="Male" value="M"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <form:radiobutton path="gender" label="Female" value="F"/><br>
   Course::<form:input path="course"/><span id="courseError"></span><form:errors path="course"/><br>
   MobileNumber:: <form:input path="mob"/><span id="mobError"></span><form:errors path="mob"/><br>    
   Email::<form:input path="email"/><span id="emailError"></span><form:errors path="email"/><br>     
     
      <input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
      <input type="reset" value="Clear"> 
</form:form>