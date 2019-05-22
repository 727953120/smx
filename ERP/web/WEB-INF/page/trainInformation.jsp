<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 2:33
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
        alert("请先发布培训内容");
        }
</script>
<c:if test="${sessionScope.train!=null && fn:length(sessionScope.train)!=0 }">
<c:forEach items="${sessionScope.train}" var="train1" >
<div>
    <table>
        <tr>
            <th>主题</th>
            <th>内容</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>地点</th>
            <th>员工</th>
            <th>删除</th>
            <th>状态</th>
            <th>返回</th>
        </tr>
        <tr>
            <td>${train1.trainTitle}</td>
            <td>${train1.trainContent}</td>
            <td>${train1.trainStatTime}</td>
            <td>${train1.trainEndTime}</td>
            <td>${train1.trainPlace}</td>
            <td><a href="trainStaff?trainId=${train1.trainId}">员工</a> </td>
            <c:if test="${train1.trainState==0}">
            <td><a href="deleteTrain?trainId=${train1.trainId}">删除</a> </td>
            <td><a href="postTrain?trainId=${train1.trainId}">草稿</a> </td>
            </c:if>
            <c:if test="${train1.trainState==1}">
                <td><a href="deleteEndTrain?trainId=${train1.trainId}">删除</a></td>
                <td>已发送</td>
            </c:if>
            <td><a href="">返回</a> </td>
        </tr>
    </table>
</div>
</c:forEach>
</c:if>
<c:if test="${sessionScope.train==null || fn:length(sessionScope.train)==0}">
   <h3>暂时没有记录</h3>
</c:if>
</body>
</html>