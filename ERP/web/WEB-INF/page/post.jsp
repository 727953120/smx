<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 13:15
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
        <form action="release" method="post">
            主题<input type="text" name="trainTitle" value="${draft.trainTitle}" required>
            内容<input type="text" name="trainContent" value="${draft.trainContent}" required>
            <input hidden type="text" name="trainId" value="${draft.trainId}">
            <input hidden type="text" name="trainState" value="${draft.trainState}">
            开始时间<input type="datetime-local" name="trainStatTime" value="${draft.trainStatTime}" required>
            结束时间<input type="datetime-local" name="trainEndTime" value="${draft.trainEndTime}" required>
            地点<input type="text" name="trainPlace" value="${draft.trainPlace}" required>
            <input  type="submit" value="提交">
        </form>
</div>
</body>
</html>