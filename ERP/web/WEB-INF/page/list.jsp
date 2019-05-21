<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 11:33
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
<script src="js/jquery-3.1.0.js"></script>
<c:if test="${requestScope.list!=null}">
    <c:forEach items="${requestScope.list}" var="staff">
<table>
    <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>电话</th>
        <th>邮箱</th>
    </tr>
    <tr>
        <td>${staff.sName}</td>
        <td>${staff.sSex}</td>
        <td>${staff.sPhone}</td>
        <td>${staff.sEmail}</td>
    </tr>
</table>
    </c:forEach>
</c:if>
<c:if test="${requestScope.list==null}">
    <h3>暂时没有其他人联系方式</h3>
</c:if>
</body>
</html>