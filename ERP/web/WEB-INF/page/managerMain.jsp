<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 20:00
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
    <label>招聘管理</label><br>
    <a href="toRecruit">招聘信息</a>
</div>
</body>
</html>