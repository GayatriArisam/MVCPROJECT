
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
    <script lang="Javascript">
        function getEmp()
        {
            var e=document.getElementById("empno").value;
            window.location.href=window.location.origin+"/MVCPROJECT/EmployeeController/extractemp/"+e;
        }
    </script>

</head>
<body>
<f:form action="${pageContext.request.contextPath}/EmployeeController/updateEmp" modelAttribute="employee" method="post">
    <table>
        <tr><td>Empno</td><td><f:input path="empno" onblur="getEmp();"></f:input></td></tr>
        <tr><td>Ename</td><td><f:input path="ename"></f:input></td></tr>
        <tr><td>Gender</td><td><f:input path="gender" readonly="true"></f:input></td></tr>
        <tr><td>Date of Birth/td><td><f:input path="dob" readonly="true"></f:input></td></tr>
        <tr><td>Deptno</td><td><f:input path="deptno"></f:input></td></tr>
        <tr><td><input type="submit" value="Update"></td></tr>
    </table>


</f:form>

</body>
</html>
