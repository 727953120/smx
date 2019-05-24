<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 0:32
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
            $("#po").change(function () {
                var pId=$('#po option:selected').val();
                $("#staff").empty();
                <c:forEach items="${sessionScope.allStaff1}" var="s">
                var id=${s.pId};
                if(pId==id){
                    $("#staff").append("<option>${s.sName}</option>");
                }
                </c:forEach>
            });
        })
    </script>
</head>
<body>
<div>
    <select id="po">
        <c:forEach items="${sessionScope.allPosition}" var="position">
        <option value="${position.pId}" >${position.pName}</option>
        </c:forEach>
    </select>
    <select id="staff"></select>
</div>
</body>
</html>