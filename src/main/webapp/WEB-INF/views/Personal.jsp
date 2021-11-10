<%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/27/2021
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:form action="GetPersonal" modelAttribute="P">
    <table>
        <tr> <td>Id </td><td> <c:input path="id"></c:input></td></tr>
        <tr> <td>Name</td><td><c:input path="name"></c:input></td></tr>
        <tr> <td>Gender </td><td> <c:input path="gender"></c:input></td></tr>
        <tr> <td>Pancard</td><td>  <c:input path="pancard"></c:input></td></tr>
        <tr> <td>Qualification </td><td><c:input path="qualification"></c:input></td></tr>
         <td><input type="submit" value="Submit"></input></td></tr>



    </table>


</c:form>
</body>
</html>
