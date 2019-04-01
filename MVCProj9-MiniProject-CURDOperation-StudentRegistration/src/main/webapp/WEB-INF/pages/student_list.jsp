<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: green;text-align: center;">Student Registered List</h1><hr><br>
 <c:choose>
     <c:when test="${!empty studentList}">
        <table  bgcolor="gold" border="1" style="color: maroon;text-align: center;" align="center">
            <tr>
               <th colspan="10">STUDENT REGISTERED LIST</th>
            </tr>
            <tr style="background-color:yellowgreen;color:white;">
               <th>SRL NO</th><th>REGISTERNO</th><th>NAME</th><th>ADDRESS</th><th>GENDER</th><th>COURSE</th><th>MOBILENO</th><th>EMAIL</th><th colspan="2">OPERATIONS</th>
            </tr>
            <c:forEach var="dto" items="${studentList}">
                 <tr>
                    <td>${dto.srlNo}</td>
                    <td>${dto.regNo}</td>
                    <td>${dto.name}</td>
                    <td>${dto.addr}</td>
                    <td>${dto.gender}</td>
                    <td>${dto.course}</td>
                    <td>${dto.mobileNo}</td>
                    <td>${dto.email}</td>
                    <td bgcolor="white"><a href="stud_edit.htm?regNo=${dto.regNo}"><img src="edit.png" width="60" height="30"></td>
                    <td bgcolor="white"><a href="stud_delete.htm?regNo=${dto.regNo}"  onclick="return confirm('Are U sure!!!Do you want to delete?')"><img src="dlt.jpg" width="60" height="30"></td>
                 </tr>
            </c:forEach>
            <!-- <tr>
               <th colspan="10" bgcolor="white"></th>
            </tr> -->
        </table>
        <p style="text-align: center;"><a href="new_register.htm"><img src="register.jpg" width="120" height="60"></a> <a href="welcome.htm"><img src="home.jpg" title="Home" width="120" height="60"></a></p>
       <c:if test="${!empty msg}">
           <p style="background:silver;text-align: center;color: blue; font-family:verdana;font-size:200%;">${msg}</p>
       </c:if>
     </c:when>
     <c:otherwise>
        <h1 style="color: red;text-align: center;">Records NotFound!!</h1>
        <h3><a href="welcome.htm">Home</a></h3>
     </c:otherwise>
 </c:choose> 