<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 10:06
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
<c:if test="${sessionScope.recruitRecord!=null}">
    <c:forEach items="${sessionScope.recruitRecord}" var="recruit" varStatus="i">
        <table>
            <tr>
                <th>公司名</th>
                <th>地址</th>
                <th>公司详情</th>
                <th>薪资</th>
                <th>福利待遇</th>
                <th>部门</th>
                <th>职位</th>
                <th>岗位要求</th>
            </tr>
            <tr>
                <td>${recruit.rCompanyName}</td>
                <td>${recruit.rCompanyAddress}</td>
                <td>${recruit.rCompanyProfile}</td>
                <td>${recruit.rSalary}</td>
                <td>${recruit.rFringeBenefits}</td>
                <td>${sessionScope.dpts[i.index].dDepartment}</td>
                <td>${sessionScope.psts[i.index].pName}</td>
                <td>${recruit.rRequirements}</td>
            </tr>
        </table>
        <c:if test="${sessionScope.seeRecord2[i.index].reState==0}">
            <h3>未查看</h3>
        </c:if>
        <c:if test="${sessionScope.seeRecord2[i.index].reState==1}">
            <h3>已查看，等待面试通知</h3>
        </c:if>

    </c:forEach>
</c:if>
<c:if test="${sessionScope.recruitRecord==null || fn:length(sessionScope.recruitRecord)==0}">
    <h3>暂时没有投递简历</h3>
</c:if>
</body>
</html>