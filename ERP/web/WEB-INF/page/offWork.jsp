<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/21
  Time: 23:55
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
<script>
    window.onload = function(){
        function getDate(){
            debugger;
            var today = new Date();
            var date;
            date = (today.getFullYear()) +"-" + (today.getMonth() + 1 ) + "-" + today.getDate() + "" + today.toLocaleTimeString('chinese',{hour12:false});
            return date;
        }
        window.setInterval(function(){
            document.getElementById("getBookTime").value=getDate();
        }, 1000);
    }
</script>
<div>
    <form action="workList" method="post">
        <input type="text"  name="cEnd" id="getBookTime" value="">
        <input  type="text" name="cBegine"  value="${sessionScope.morning.cBegine}" readonly>
    </form>
</div>
</body>
</html>