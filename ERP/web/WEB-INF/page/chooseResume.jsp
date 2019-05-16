<%@ page import="com.smx.model.TResume" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 1:56
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
    </tr>
    <tr>
        <td>${sessionScope.tRecruit1.rCompanyName}</td>
        <td>${sessionScope.tRecruit1.rCompanyAddress}</td>
        <td>${sessionScope.tRecruit1.rCompanyProfile}</td>
        <td>${sessionScope.tRecruit1.rSalary}</td>
        <td>${sessionScope.tRecruit1.rFringeBenefits}</td>
        <td>${sessionScope.tRecruit1.rDepartment}</td>
        <td>${sessionScope.tRecruit1.rPosition}</td>
        <td>${sessionScope.tRecruit1.rRequirements}</td>
    </tr>
</table>
</div>
<div>

<form action="addRecord2" method="post">
    <c:if test="${sessionScope.tResumes!=null}">
    <c:forEach items="${sessionScope.tResumes}" var="Resume">
     简历${Resume.resumeId}<input type="radio" name="resumeId" value="${Resume.resumeId}">
    </c:forEach>
    </c:if>
    <input type="submit" value="确定">
</form>
</div>
</body>
</html>