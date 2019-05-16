<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/15
  Time: 19:18
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
<c:if test="${sessionScope.tResumes!=null}">
<c:forEach items="${sessionScope.tResumes}" var="resume">
    <div>
    <table border="2px">
        <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        </tr>
        <tr>
            <td>${resume.resumeName}</td>
            <td>${resume.resumeSex}</td>
            <td>${resume.resumeAge}</td>
        </tr>
        <tr>
        <th>邮箱</th>
        <th>手机号</th>
        <th>地址</th>
        </tr>
        <tr>
            <td>${resume.resumeEmail}</td>
            <td>${resume.resumePhone}</td>
            <td>${resume.resumeAddress}</td>
        </tr>
        <tr>
        <th>期望薪资</th>
        <th>学历</th>
        <th>就学时间</th>
        </tr>
        <tr>
            <td>${resume.resumeSalaryExpectation}</td>
            <td>${resume.resumeEducation}</td>
            <td>${resume.resumeEducationTime}</td>
        </tr>
        <tr>
        <th>公司</th>
        <th>就职时间</th>
        <th>担任职位</th>
        </tr>
        <tr>
            <td>${resume.resumeCompany}</td>
            <td>${resume.resumeTime}</td>
            <td>${resume.resumePosition}</td>
        </tr>
        <tr>
        <th>工作经历</th>
        </tr>
        <tr>
            <td>${resume.resumeExperience}</td>
        </tr>
        <tr>
        <th>修改</th>
        <th>删除</th>
        </tr>
        <tr>
            <td><a href="toUpdate?resumeId=${resume.resumeId}">修改</a></td>
            <td><a href="delete?resumeId=${resume.resumeId}">删除</a></td>
        </tr>
    </table>
    </div>
    </c:forEach>
    </c:if>
<div>
    <a href="toAddResume">添加简历</a>
</div>
<c:if test="${sessionScope.tResumes==null}">
    <div>
    <h3>你还没有简历</h3><br>
    <a href="toAddResume">添加简历</a>
    </div>
</c:if>
</div>
</body>
</html>