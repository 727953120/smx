<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/15
  Time: 20:23
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
    <form action="AddResume" method="post">
     <h3>简历</h3><br>
     姓名<input type="text" name="resumeName" required>性别<input type="text" name="resumeSex" required><br>
     年龄<input type="number" name="resumeAge" required>邮箱<input type="text" name="resumeEmail" required><br>
     电话<input type="text" name="resumePhone" required>地址<input type="text" name="resumeAddress" required><br>
     期望薪资<input type="number" name="resumeSalaryExpectation" required><br>
     学历<input type="text" name="resumeEducation" required>时间<input type="text" name="resumeEducationTime" required><br>
     公司<input type="text" name="resumeCompany" required>就职时间<input type="date" name="resumeTime" required><br>
     职位<input type="text" name="resumePosition" required><br>
     工作经历<input type="text" name="resumeExperience" required><br><input hidden name="rId" value="${sessionScope.t.tid}">
     <input type="submit" value="提交"><a href="#">返回</a>
    </form>
</div>
</body>
</html>