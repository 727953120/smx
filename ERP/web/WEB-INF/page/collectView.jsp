<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/17
  Time: 14:19
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
<c:if test="${sessionScope.managerView!=null && fn:length(sessionScope.managerView)!=0}" >
    <c:forEach items="${sessionScope.managerView}" var="view">
<div>
    <table>
        <tr>
            <th>姓名</th>
            <th>公司</th>
            <th>地点</th>
            <th>时间</th>
            <th>部门</th>
            <th>职位</th>
            <th>面试状态</th>
        </tr>
        <tr>
            <td>${view.TName}</td>
            <td>${view.ICompany}</td>
            <td>${view.IPlace}</td>
            <td>${view.IDate}</td>
            <td>${view.IDepartment}</td>
            <td>${view.IPosition}</td>
            <c:if test="${view.IState==0}"><td><a href="check?reId=${view.reId}">未面试</a></td></c:if>
            <c:if test="${view.IState==1}"><td><a href="check?reId=${view.reId}">已面试</a></td></c:if>
        </tr>
    </table>
</div>
    </c:forEach>
</c:if>
<c:if test="${sessionScope.managerView==null ||fn:length(sessionScope.managerView)==0}">
 <h3>没有面试</h3>
</c:if>
</body>
</html>