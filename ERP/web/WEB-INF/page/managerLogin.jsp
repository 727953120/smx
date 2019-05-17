<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 19:44
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
    <form action="getManager" method="post">
        账号<input type="text" name="mName" required><br>
        密码<input type="text" name="mPass" required><br>
        <input type="submit" value="登陆">
    </form>
</div>
</body>
</html>