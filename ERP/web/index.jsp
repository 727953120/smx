<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/14
  Time: 23:28
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
<script>
    function MsgBox() {
        alert("请先登陆");
        window.location.href="toLogin"}
</script>
<a href="toLogin">登陆</a>
<a href="toRegister">注册</a>
<c:if test="${sessionScope.recruits!=null}">
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
        <td><input type="button" value="投递" onclick="MsgBox()"/></td>
    </tr>
</table>
</c:forEach>
</c:if>
<c:if test="${sessionScope.recruits==null}">
    <div>
        <h3>暂时没有招聘信息</h3>
    </div>
</c:if>
</body>
</html>