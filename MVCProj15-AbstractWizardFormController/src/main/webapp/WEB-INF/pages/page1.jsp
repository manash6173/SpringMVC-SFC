<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    <h1 style="color: red;text-align: center;">Form Page1</h1><br><br><br>
    <form:form commandName="regCmd">
          <table align="center" bgcolor="cyan">
             <tr>
                <th>First Name::</th><th><form:input  path="firstName"/></th>&nbsp;&nbsp;&nbsp;
                <th>Last Name::</th><th><form:input  path="lastName"/></th>
             </tr>
           <tr>
                <th>Email::</th><th><form:input  path="email"/></th>&nbsp;&nbsp;&nbsp;
                <th>Mobile No::</th><th><form:input  path="mob"/></th>
             </tr>
             <tr>
                <th><input type="submit" name="_target1" value="NEXT"></th>&nbsp;&nbsp;
                <th><input type="submit" name="_cancel" value="CANCEL"></th>
             </tr>
          </table>
    </form:form>