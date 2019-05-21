<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 19:47
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
    <form action="departmentDelete" method="post">
    <select name="dId">
    <c:forEach items="${sessionScope.deleteDepart}" var="department">
        <option value="${department.dId}">${department.dDepartment}</option>
    </c:forEach>
    </select>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>