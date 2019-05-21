<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 12:59
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
    window.onload = function(){
        function getDate(){
            debugger;
            var today = new Date();
            var date;
            date = (today.getFullYear()) +"-" + (today.getMonth() + 1 ) + "-" + today.getDate();
            return date;
        }
        window.setInterval(function(){
            document.getElementById("getBookTime").value=getDate();
        }, 1000);
    }
</script>
<div>
    <form action="addDepartment" method="post">
        部门<input type="text" name="dDepartment">
        成立时间<input type="text" name="dDate" id="getBookTime" value="">
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>