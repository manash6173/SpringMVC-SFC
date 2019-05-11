<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:choose>
     <c:when test="${!empty prodList}">
        <table border="1" bgcolor="aqua" style="color: maroon;text-align: center;" align="center">
            <tr>
               <th colspan="6">Product List</th>
            </tr>
            <tr>
               <th>Srlno</th><th>Pid</th><th>pname</th><th>price</th><th>MfgDate</th><th>ExpDate</th>
            </tr>
            <c:forEach var="dto" items="${prodList}">
                 <tr>
                    <td>${dto.slno}</td>
                    <td>${dto.pid}</td>
                    <td>${dto.pname}</td>
                    <td>${dto.price}</td>
                    <td>${dto.mfgDate}</td>
                    <td>${dto.expDate}</td>
                 </tr>
            </c:forEach>
        </table>
         <h3><a href="home.do">Home</a></h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <h3><a href="JavaScript:doPrint()">print</a></h3>
     </c:when>
     <c:otherwise>
        <h1 style="color: red;text-align: center;">Records NotFound!!</h1>
        <h3><a href="welcome.do">Home</a></h3>
     </c:otherwise>
 </c:choose> 
 <script type="text/javascript">
   function doPrint(){
     frames.focus();
     frames.print();
   } 
</script>
     
