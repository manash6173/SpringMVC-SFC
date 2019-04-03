<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<h1 style="color: maroon; text-align: center;">You Have
	successfully Register</h1>
	<p style="text-align: center;color: orange;">

	firstName:: <span style="color: purple;">${cmd.firstName} </span><br>
	lastName:: <span style="color: purple;">${cmd.lastName} </span> <br>
	Email:: <span style="color: purple;">${cmd.email} </span> <br>
	MobileNo:: <span style="color: purple;">${cmd.mob} </span> <br>
	Domain:: <span style="color: purple;">${cmd.domain} </span> <br>
	Location:: <span style="color: purple;">${cmd.location} </span> <br>
	Experience:: <span style="color: purple;">${cmd.experience} </span> <br>
	CurrentSalary:: <span style="color: purple;">${cmd.currentSal} </span>
	<br> ExpectedSalary::<span style="color: purple;">${cmd.expectedSal}</span><br>
</p>
<a href="home.htm">Home</a>
