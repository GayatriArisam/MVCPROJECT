<%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/28/2021
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
    <style>
        .error
        {
            color:red;
            font-weight:bold;
        }

    </style>
</head>
<body>
<form:form action="doLogin" modelAttribute="login" method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
                <tr><td><input type="submit"></td></tr>
    </table>




</form:form>


</body>
</html>
