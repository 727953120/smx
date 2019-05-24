<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/23
  Time: 1:40
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
<c:if test="${sessionScope.allRecord1!=null && fn:length(sessionScope.allRecord1)!=0}">
<div>
    <table>
        <tr>
            <th>时间</th>
            <th>原因</th>
            <th>奖罚内容</th>
            <th>异议</th>
        </tr>
        <c:forEach items="${sessionScope.allRecord1}" var="record">
        <tr>
            <td>${record.recordDate}</td>
            <td>${record.recordReason}</td>
            <td>${record.recordMoney}元</td>
            <td><a href="postDisAgree?recordId=${record.recordId}">异议</a> </td>
        </tr>
        </c:forEach>
    </table>
</div>
</c:if>
<c:if test="${sessionScope.allRecord1==null && fn:length(sessionScope.allRecord1)==0}">
    <h3>没有任何奖罚</h3>
</c:if>
</body>
</html>