<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/19
  Time: 13:51
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
    <form action="addStaff" method="post">
        姓名<input type="text" name="sName" value="${sessionScope.checkOneResume.resumeName}" required>
        密码<input type="text" name="sPass" value="123456" required>
        性别<input type="text" name="sSex" value="${sessionScope.checkOneResume.resumeAge}" required>
        电话<input type="text" name="sPhone" value="${sessionScope.checkOneResume.resumePhone}" required>
        邮箱<input type="text" name="sEmail" value="${sessionScope.checkOneResume.resumeEmail}" required>
        银行卡<input type="text" name="sBankCard" required>
        入职时间<input type="Date" name="sDate" required>
        部门<input type="text" name="dDepartment" value="${sessionScope.checkOneDepartment.dDepartment}" readonly>
        <input hidden name="dId" value="${sessionScope.checkOneRecruit.dId}" >
        职位<input type="text" name="pName" value="${sessionScope.checkOnePosition.pName}" readonly>
        <input hidden name="pId" value="${sessionScope.checkOneRecruit.pId}">
        薪资<input type="text" name="sMoney" value="${sessionScope.checkOneRecruit.rSalary}" readonly>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>