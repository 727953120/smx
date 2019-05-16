<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 0:09
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
    <form action="updateResume" method="post">
        姓名<input type="text" name="resumeName" value="${sessionScope.resume1.resumeName}" required>性别<input type="text" name="resumeSex" value="${sessionScope.resume1.resumeSex}" required><br>
        年龄<input type="number" name="resumeAge" value="${sessionScope.resume1.resumeAge}" required>邮箱<input type="text" name="resumeEmail" value="${sessionScope.resume1.resumeEmail}" required><br>
        电话<input type="text" name="resumePhone" value="${sessionScope.resume1.resumePhone}" required>地址<input type="text" name="resumeAddress" value="${sessionScope.resume1.resumeAddress}" required><br>
        期望薪资<input type="number" name="resumeSalaryExpectation"  value="${sessionScope.resume1.resumeSalaryExpectation}" required><br>
        学历<input type="text" name="resumeEducation" value="${sessionScope.resume1.resumeEducation}" required>时间<input type="text" name="resumeEducationTime"  value="${sessionScope.resume1.resumeEducationTime}" required><br>
        公司<input type="text" name="resumeCompany" value="${sessionScope.resume1.resumeCompany}" required>就职时间<input type="date" name="resumeTime" value="${sessionScope.resume1.resumeTime}" required><br>
        职位<input type="text" name="resumePosition"  value="${sessionScope.resume1.resumePosition}" required><br>
        工作经历<input type="text" name="resumeExperience" value="${sessionScope.resume1.resumeExperience}" required><br><input hidden name="rId" value="${sessionScope.t.tid}"><input hidden name="resumeId" value="${sessionScope.resume1.resumeId}">
        <input type="submit" value="提交"><a href="#">返回</a>
    </form>
</div>
</body>
</html>