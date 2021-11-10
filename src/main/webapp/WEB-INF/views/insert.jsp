<%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/27/2021
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

<a href="insert">Add New Employee.....</a>
<div class="container-fluid">
<form:form action="SaveEmp" modelAttribute="employee" method="post">
    <table>
        <tr><td>Empno</td><td><form:input path="empno" /> <form:errors path="empno"></form:errors> </td></tr>
        <tr><td>Ename</td><td><form:input path="ename" />  <form:errors path="ename"></form:errors></td></tr>
        <tr><td>Gender</td><td><form:input path="gender" /> <form:errors path="gender"></form:errors> </td></tr>
        <tr><td>Date of Birth</td><td><form:input path="dob" />  </td></tr>
        <tr><td>Dept No</td><td><form:input path="deptno" />  </td></tr>
        <tr><td><input type="submit" class="btn btn-primary" />  </td></tr>
    </table>
</form:form>

</div>
</body>
</html>
