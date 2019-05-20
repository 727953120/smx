<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/19
  Time: 16:47
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
    <c:if test="${sessionScope.staffs!=null}">
        <c:forEach items="${sessionScope.staffs}" var="staff">
    <table>
        <tr>
            <th>姓名</th>
            <th>密码</th>
            <th>性别</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>银行卡</th>
            <th>入职时间</th>
            <th>部门</th>
            <th>职位</th>
            <th>再次确认</th>
        </tr>
        <tr>
            <td>${staff.sName}</td>
            <td>${staff.sPass}</td>
            <td>${staff.sSex}</td>
            <td>${staff.sPhone}</td>
            <td>${staff.sEmail}</td>
            <td>${staff.sBankCard}</td>
            <td>${staff.sDate}</td>
            <td>${staff.sDepartment}</td>
            <td>${staff.sPosition}</td>
            <c:if test="${staff.sState==0}">
                <td><a href="sureStaff?sId=${staff.sId}">确认提交</a></td>
            </c:if>
            <c:if test="${staff.sState==1}">
                <td>已确认</td>
            </c:if>
        </tr>
    </table>
        </c:forEach>
    </c:if>
</div>
</body>
</html>