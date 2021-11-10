<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/27/2021
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        List<String> list=(List<String>)request.getAttribute("list");
        for(String s:list)
        {

            out.println(s);
        }
    %>

</head>
<body>

</body>
</html>
