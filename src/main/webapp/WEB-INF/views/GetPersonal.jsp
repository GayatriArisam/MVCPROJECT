<%--
  Created by IntelliJ IDEA.
  User: PHANI
  Date: 10/27/2021
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.springmvc.pojo.PersonalDetails"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%PersonalDetails P=(PersonalDetails)request.getAttribute("P");
    out.println(P.getId());
    out.println(P.getName());
    out.println(P.getGender());
    out.println(P.getPancard());
    out.println(P.getQualification());


%>
</body>
</html>
