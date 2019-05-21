<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 13:14
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
    <table>
        <tr>
            <th>部门</th>
            <th>成立时间</th>
        </tr>
        <c:if test="${sessionScope.depart!=null}">
            <c:forEach items="${sessionScope.depart}" var="department">
        <tr>
            <td>${department.dDepartment}</td>
            <td>${department.dDate}</td>
        </tr>
            </c:forEach>
        </c:if>
    </table>
</div>
</body>
</html>