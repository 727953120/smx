<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 13:41
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
    <form action="updateStaffInformation" method="post">
        <input type="text" name="sName" value="${staffInformation.sName}" required>
        <input type="text" name="sPass" value="${staffInformation.sPass}" required>
        <input type="text" name="sSex" value="${staffInformation.sSex}" required>
        <input type="text" name="sPhone" value="${staffInformation.sPhone}" required>
        <input type="text" name="sEmail" value="${staffInformation.sEmail}" required>
        <input type="text" name="sBankCard" value="${staffInformation.sBankCard}" required>
        <input hidden name="sState" value="${staffInformation.sState}" required>
        <input hidden name="sId" value="${staffInformation.sId}" required>
        <input type="submit" value="确定">
    </form>
</div>
</body>
</html>