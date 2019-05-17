<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/14
  Time: 21:56
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
<div>
-----------------------------欢迎您${sessionScope.t.tName}--------------------------------
</div>
<a href="toResume">个人简历</a>
<a href="getAlreadyPost">已投递</a>
<a href="getMyInterview?tid=${sessionScope.t.tid}">面试</a>
<a href="">邮箱</a>
<c:forEach items="${sessionScope.recruits}" var="recruit">
    <table>
        <tr>
            <th>公司名</th>
            <th>地址</th>
            <th>公司详情</th>
            <th>薪资</th>
            <th>福利待遇</th>
            <th>部门</th>
            <th>职位</th>
            <th>岗位要求</th>
            <th>投递</th>
        </tr>
        <tr>
            <td>${recruit.rCompanyName}</td>
            <td>${recruit.rCompanyAddress}</td>
            <td>${recruit.rCompanyProfile}</td>
            <td>${recruit.rSalary}</td>
            <td>${recruit.rFringeBenefits}</td>
            <td>${recruit.rDepartment}</td>
            <td>${recruit.rPosition}</td>
            <td>${recruit.rRequirements}</td>
            <td><a href="toChoose?rid=${recruit.rid}">投递简历</a> </td>
        </tr>
    </table>
</c:forEach>
</body>
</html>