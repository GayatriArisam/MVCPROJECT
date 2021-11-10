<%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/27/2021
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
values  <%  String e=(String)request.getAttribute("empno");
    String en=(String)request.getAttribute("ename");
    out.println(e+ " "+en);
%>
</body>
</html>
