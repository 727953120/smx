<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/23
  Time: 1:25
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
    <table>
        <c:if test="${sessionScope.allCheck!=null && fn:length(sessionScope.allCheck)!=0}">
        <tr>
        <th>上班卡</th>
        <th>下班卡</th>
        </tr>

            <c:forEach items="${sessionScope.allCheck}" var="check">
            <td>${check.cBegine}</td>
            <td>${check.cEnd}</td>
            </c:forEach>

    </table>
    </c:if>
    <c:if test="${sessionScope.allCheck==null && fn:length(sessionScope.allCheck)==0}">
        <h3>暂时没有考勤记录</h3>
    </c:if>
</div>
</body>
</html>