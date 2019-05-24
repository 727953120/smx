<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/22
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<body>
<div>
    <h3>${night.cBegine}</h3><br>
    <h3>${night.cEnd}</h3><br>
</div>
</body>
</html>