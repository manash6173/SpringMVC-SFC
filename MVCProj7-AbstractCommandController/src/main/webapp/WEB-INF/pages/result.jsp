<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:choose>
     <c:when test="${!empty empDetails}">
        <table border="1" bgcolor="aqua" style="color: maroon;text-align: center;" align="center">
            <tr>
               <th colspan="9">Searing Employee Result</th>
            </tr>
            <tr>
               <th>Srlno</th><th>EmpNo</th><th>Ename</th><th>Job</th><th>Mgr</th><th>HireDate</th><th>Sal</th><th>Comm</th><th>DeptNO</th>
            </tr>
            <c:forEach var="dto" items="${empDetails}">
                 <tr>
                    <td>${dto.srlno}</td>
                    <td>${dto.empno}</td>
                    <td>${dto.ename}</td>
                    <td>${dto.job}</td>
                    <td>${dto.mgr}</td>
                    <td>${dto.hiredate}</td>
                    <td>${dto.sal}</td>
                    <td>${dto.comm}</td>
                    <td>${dto.deptNo}</td>
                 </tr>
            </c:forEach>
        </table>
         <h3><a href="search.do">Home</a></h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <h3><a href="JavaScript:doPrint()">print</a></h3>
     </c:when>
     <c:otherwise>
        <h1 style="color: red;text-align: center;">Records NotFound!!</h1>
        <h3><a href="search.do">Home</a></h3>
     </c:otherwise>
 </c:choose> 
 <script type="text/javascript">
   function doPrint(){
     frames.focus();
     frames.print();
   } 
</script>
