<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 0:51
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
<form action="positionDelete" method="post">
<select name="pId">
    <c:forEach items="${sessionScope.allPosition}" var="position">
        <option value="${position.pId}">${position.pName}</option>
    </c:forEach>
</select>
    <input type="submit" value="删除">
</form>
</body>
</html>