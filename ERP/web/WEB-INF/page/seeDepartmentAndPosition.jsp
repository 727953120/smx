<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 10:21
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#dep").change(function () {
                var did= $('#dep option:selected').val();
                $("#pos").empty();
                <c:forEach items="${sessionScope.position}" var="position">
                var p_did=${position.dId};
                if(did==p_did){
                    $("#pos").append("<option value='${position.pId}'>${position.pName}</option>");
                }
                </c:forEach>
            });
            $("#pos").change(function () {
                var pid= $('#pos option:selected').val();
                $("#emp").empty();
                <c:forEach items="${sessionScope.staff1}" var="emp">
                var e_pid=${emp.pId};
                if(pid==e_pid){
                    $("#emp").append("<option value='${emp.staff1Id}'>${emp.staff1Name}</option>");
                }
                </c:forEach>
            });
        })
    </script>
</head>
<body>
<div>
    部门：<select id="dep">
    <c:forEach items="${sessionScope.department}" var="department">
        <option value="${department.dId}">${department.dDepartment}</option>
    </c:forEach>
</select>
    职位：<select id="pos">
</select>
    人员：<select id="emp">
</select>
</div>
</body>
</html>