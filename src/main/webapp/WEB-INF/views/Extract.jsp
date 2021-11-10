<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script>
        function getempno()
        {
      var empelement=document.getElementsByName("empno");
        var s;
        for(i=0;i<empelement.length;i++)
        {
            if(empelement[i].checked)
            {
              s=empelement[i].value;
            }
        }
        window.location.href=window.location.origin+"/MVCPROJECT/EmployeeController/extractemp/"+s;

        }


    </script>


</head>
<body>
<form action="extractEmp" method="POST">
Enter Deptno  <select name="deptno">
    <option>-Select-</option>
    <c:forEach var="d" items="${list}">
        <c:choose>
            <c:when test="${d eq dno}">
                <option selected="true">${d}</option>
            </c:when>
            <c:otherwise>
                <option>${d}</option>
            </c:otherwise>
        </c:choose>

    </c:forEach>
</select>
<input type="submit">
    <c:if test="${!empty LEmp}">
<table>
    <tr><td>Select</td><td>Empno</td><td>Ename</td><td>Gender</td><td>Dob</td><td>Deptno</td></tr>
    <c:forEach var="E" items="${LEmp}">

        <tr>
            <td><input type="radio" name="empno" value="${E.empno}"> </td>
            <td>${E.empno}</td>
            <td>${E.ename}</td>
            <td>${E.gender}</td>
            <td>${E.dob}</td>
            <td>${E.deptno}</td>
        </tr>
    </c:forEach>
</table>
<input type="button" name="Get" value="Get Employee details" onclick="getempno();">

    </c:if>
</form>
</body>
</html>
