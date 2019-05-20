<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 15:35
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
<c:if test="${sessionScope.myInterview!=null}">
    <c:forEach items="${sessionScope.myInterview}" var="interview">
        <table>
            <tr>
                <th>姓名</th>
                <th>公司</th>
                <th>地点</th>
                <th>时间</th>
                <th>部门</th>
                <th>职位</th>
                <th>面试情况</th>
            </tr>
            <tr>
                <td>${interview.TName}</td>
                <td>${interview.ICompany}</td>
                <td>${interview.IDate}</td>
                <td>${interview.IPlace}</td>
                <td>${interview.IDepartment}</td>
                <td>${interview.IPosition}</td>
                <td>
                    <c:if test="${interview.IState==0}">
                        <a href="agree?IId=${interview.IId}">待面试，是否同意</a>
                    </c:if>
                    <c:if test="${interview.IState==1}">已面试</c:if>
                    <c:if test="${interview.IState==2}">面试通过</c:if>
                </td>
            </tr>
        </table>
    </c:forEach>
</c:if>
<c:if test="${sessionScope.myInterview==null}">
    <h3>暂时没有面试通知</h3>
</c:if>
</body>
</html>