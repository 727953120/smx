<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 20:00
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
    <label>招聘管理</label><br>
    <a href="toRecruit">招聘信息</a>
    <a href="getInterviewers">简历</a>
    <a href="getInterviews">面试情况</a>
</div>
<div>
    <label>部门管理</label>
    <a href="getLink">查看部门</a>
    <a href="toCreateDepartment">新增部门</a>
    <a href="">删除部门</a>
</div>
<div>
    <label>员工管理</label>
    <a href="entry">员工入职</a>
</div>
</body>
</html>