<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <h1 style="color:navy;text-align: center">Welcome Home Page</h1><hr>
    <form action="employee.do" method="POST">
       <table align="center" bgcolor="aqua" style="color: maroon;text-align: center;">
          <tr>
            <th>EmpNo::</th><th><input type="text" name="tempno"></th>
          </tr>
           <tr>
            <th>EmpName::</th><th><input type="text" name="tename"></th>
          </tr>
           <tr>
            <th>DeptNo::</th><th><input type="text" name="tdeptno"></th>
          </tr>
          <tr>
            <th colspan="2"><input type="submit" value="search"></th>
          </tr>
       </table>
    </form>
