<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 22:05
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
            <th>姓名</th>
            <th>部门</th>
            <th>职位</th>
        </tr>
        <c:forEach items="${sessionScope.staffTrain}" var="staff">
        <tr>
            <td>${staff.sName}</td>
            <td>${staff.sDepartment}</td>
            <td>${staff.sPosition}</td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>