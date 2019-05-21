<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 8:21
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
    <a href="myselfInformation?sId=${sessionScope.staff.sId}">查看个人信息</a>
    <a href="toList">通讯录</a>
    <a href="clock">打卡</a>
</div>
</body>
</html>