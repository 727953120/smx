<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/17
  Time: 12:46
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
         alert("该候选人还没面试")}
</script>
<script>
    function employ() {
        window.location.href="employStaff"}
</script>
<div>
    <table border="2px">
        <tr>
            <th>部门</th>
            <th>职位</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneRecruit.rDepartment}</td>
            <td>${sessionScope.checkOneRecruit.rPosition}</td>
        </tr>
        <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneResume.resumeName}</td>
            <td>${sessionScope.checkOneResume.resumeSex}</td>
            <td>${sessionScope.checkOneResume.resumeAge}</td>
        </tr>
        <tr>
            <th>邮箱</th>
            <th>手机号</th>
            <th>地址</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneResume.resumeEmail}</td>
            <td>${sessionScope.checkOneResume.resumePhone}</td>
            <td>${sessionScope.checkOneResume.resumeAddress}</td>
        </tr>
        <tr>
            <th>期望薪资</th>
            <th>学历</th>
            <th>就学时间</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneResume.resumeSalaryExpectation}</td>
            <td>${sessionScope.checkOneResume.resumeEducation}</td>
            <td>${sessionScope.checkOneResume.resumeEducationTime}</td>
        </tr>
        <tr>
            <th>公司</th>
            <th>就职时间</th>
            <th>担任职位</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneResume.resumeCompany}</td>
            <td>${sessionScope.checkOneResume.resumeTime}</td>
            <td>${sessionScope.checkOneResume.resumePosition}</td>
        </tr>
        <tr>
            <th>工作经历</th>
        </tr>
        <tr>
            <td>${sessionScope.checkOneResume.resumeExperience}</td>
        </tr>
        <c:if test="${sessionScope.checkOneInterview.IState==0}">
        <tr>
            <th>录用</th>
        </tr>
        <tr>
            <td><input type="button" value="录用" onclick="MsgBox()"> </td>
        </tr>
        </c:if>
        <c:if test="${sessionScope.checkOneInterview.IState==1}">
            <tr>
                <th>录用</th>
            </tr>
            <tr>
                <td><input type="button" value="录用" onclick="employ()"> </td>
            </tr>
        </c:if>

    </table>
</div>
<div>
    <a href="">返回</a><br>
</div>
</body>
</html>