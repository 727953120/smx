<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/17
  Time: 11:03
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
<c:if test="${sessionScope.allRecord!=null}">
<c:forEach items="${sessionScope.allRecord}" var="record">
    <div>
        <table>
            <tr>
                <th>简历编号</th>
                <th>查看</th>
                <th>发起面试</th>
            </tr>
            <tr>
                <td>${record.reId}</td>
                <c:if test="${record.reState==0}">
                <td><a href="check?reId=${record.reId}">未查看</a></td>
                </c:if>
                <c:if test="${record.reState==1}">
                    <td><a href="check?reId=${record.reId}">已查看</a></td>
                </c:if>
                <td>
                    <a href="postInterview?reId=${record.reId}">发起面试</a><br>
                </td>
            </tr>
        </table>
    </div>
</c:forEach>
</c:if>
<c:if test="${sessionScope.allRecord==null||fn:length(sessionScope.allRecord)==0}">
    <h3>没有简历</h3>
</c:if>
</body>
</html>