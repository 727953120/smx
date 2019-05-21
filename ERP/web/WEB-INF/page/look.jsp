<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 8:30
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
            <th>性别</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>银行卡</th>
            <th>入职时间</th>
            <th>部门</th>
            <th>职位</th>
            <th>修改</th>
            <th>返回</th>
        </tr>
        <tr>
            <td>${staffInformation.sName}</td>
            <td>${staffInformation.sSex}</td>
            <td>${staffInformation.sPhone}</td>
            <td>${staffInformation.sEmail}</td>
            <td>${staffInformation.sBankCard}</td>
            <td>${staffInformation.sDate}</td>
            <td>${staffInformation.sDepartment}</td>
            <td>${staffInformation.sPosition}</td>
            <td><a href="toUpdateStaff">修改</a> </td>
            <td><a href="#">返回</a> </td>
        </tr>
    </table>
</div>
</body>
</html>