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
    <a href="draft">草稿</a>
    <a href="getInterviewers">简历</a>
    <a href="getInterviews">面试情况</a>
</div>
<div>
    <label>部门管理</label>
    <a href="getLink">部门分布</a>
    <a href="toCreateDepartment">新增部门</a>
    <a href="toDeleteDepartment">删除部门</a>
    <a href="toCreatePosition">新增职位</a>
    <a href="getAllPosition">查看职位</a>
    <a href="toDeletePosition">删除职位</a>
</div>
<div>
    <label>员工管理</label>
    <a href="entry">员工入职</a>
</div>
<div>
    <label>培训管理</label>
    <a href="toTrain">培训记录</a>
    <a href="toAddTrain">添加培训记录</a>
    <a href="toGetSalary">薪资结算</a>
</div>
</body>
</html>