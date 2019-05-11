<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:scriptlet>
  String[] languageList=(String[])request.getAttribute("language1");
</jsp:scriptlet>
<h1 style="color: red;text-align: center;">List of Languages</h1><hr>
<%
   for(String c:languageList){
     if(c!=null && c.length()>0) {%>
          <h4 style="color:blue;text-align: center;"><%=c %></h4>
           
      <% }
      }%>