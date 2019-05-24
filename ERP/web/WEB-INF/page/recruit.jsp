<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/16
  Time: 23:05
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
<c:if test="${sessionScope.allTRecruits!=null}">
    <c:forEach items="${sessionScope.allTRecruits}" var="recruits" varStatus="i">
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
                <c:if test="${recruits.rState==0}">
                <th>发布</th>
                <th>删除</th>
                </c:if>
                <c:if test="${recruits.rState==1}">
                    <th>撤回</th>
                </c:if>
            </tr>
            <tr>
                <td>${recruits.rCompanyName}</td>
                <td>${recruits.rCompanyAddress}</td>
                <td>${recruits.rCompanyProfile}</td>
                <td>${recruits.rSalary}</td>
                <td>${recruits.rFringeBenefits}</td>
                <td>${sessionScope.dpts[i.index].dDepartment}</td>
                <td>${sessionScope.psts[i.index].pName}</td>
                <td>${recruits.rRequirements}</td>
                    <c:if test="${recruits.rState==0}">
                <td>
                    <a href="postRecruit?rid=${recruits.rid}">发布</a>
                </td>
                        <td>
                         <a href="deleteRecruit?rid=${recruits.rid}">删除</a>
                        </td>
                    </c:if>
                    <c:if test="${recruits.rState==1}">
                       <td> <a href="backRecruit?rid=${recruits.rid}">撤回</a></td>
                    </c:if>


            </tr>
        </table>
    </c:forEach>
</c:if>
</body>
</html>