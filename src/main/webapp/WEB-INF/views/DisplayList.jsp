<%@ page import="java.util.*" %>
<%@ page import="com.springmvc.pojo.Emp" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Emp> LE=(List<Emp>)request.getAttribute("Lemp");
    for(Emp e: LE)
    {

        out.println(e.getEmpno()+ " "+ e.getEname()+ " "+e.getAge());
    }
%>



</body>
</html>
