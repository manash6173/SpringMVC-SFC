<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:scriptlet>
  String[] countryList=(String[])request.getAttribute("country");
</jsp:scriptlet>
<h1 style="color: red;text-align: center;">List of Countries</h1><hr>
<table border="1" align="center">
        <tr>
           <th style="color: red;text-align: center;">Countries</th>
        </tr>
 <%
   for(String c:countryList){ %>
	   <tr>
  <%    if(c!=null && c.length()>0) {%>
     
          <td><h4 style="color:blue;text-align: center;"><%=c %></h4></td>
         </tr>  
      <% }
         
      }%>
       </table>

