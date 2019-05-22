<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 2:38
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
    <c:if test="${sessionScope.staffList!=null}">
    <form action="trainAdd" method="post">
        主题<input type="text" name="trainTitle" required>
        内容<input type="text" name="trainContent" required>
            <c:forEach items="${sessionScope.staffList}" var="staff">
           ${staff.sName}<input  type="checkbox" name="sId" value="${staff.sId}">
            </c:forEach>
        开始时间<input type="datetime-local" name="trainStatTime" required>
        结束时间<input type="datetime-local" name="trainEndTime" required>
        地点<input type="text" name="trainPlace" required>
        <input  type="submit" value="提交">
    </form>
    </c:if>
    <c:if test="${sessionScope.staffList==null}">
        <h3>对不起没有可发起的对象</h3>
    </c:if>
</div>
</body>
</html>