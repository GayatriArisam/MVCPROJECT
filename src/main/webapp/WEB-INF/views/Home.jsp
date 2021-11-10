<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String S=(String)request.getAttribute("name");
    out.println("Welcome Home "+ S);
    List<String>LS=(List<String>)request.getAttribute("LS");
    for(String s:LS)
    {
        out.println(s);
    }
%>
</body>
</html>
