<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/14
  Time: 21:57
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
<form action="login" method="post">
    账号<input type="text" name="name">
    密码<input type="text" name="pass">
    <input type="submit" value="登陆">
</form>
</body>
</html>