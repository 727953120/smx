<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/17
  Time: 14:03
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
    <form action="addView" method="post">
        地点<input type="text" name="IPlace" required>
        时间<input type="datetime-local" name="IDate" required>
        公司<input type="text" name="ICompany" required>
        姓名<input type="text" name="TName" value="${t1.tName}" required>
        部门<input type="text" name="IDepartment" value="${r1.rDepartment}" required>
        职位<input type="text" name="IPosition" value="${r1.rPosition}" required>
        <input hidden name="tId" value="${t1.tid}">
        <input hidden name="reId" value="${re.reId}">
        <input type="submit" value="发送">
    </form>
</div>
</body>
</html>