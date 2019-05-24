<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/23
  Time: 21:00
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
                <c:forEach items="${sessionScope.positionList}" var="position">
                var p_did=${position.dId};
                if(did==p_did){
                    $("#pos").append("<option value='${position.pId}'>${position.pName}</option>");
                }
                </c:forEach>
            });
        })
    </script>
</head>
<body>
<c:if test="${sessionScope.departmentList!=null && fn:length(sessionScope.departmentList)!=0}">
<div>
    <form action="addRecruit" method="post">
        公司名字<input type="text" name="rCompanyName" required><br>
        地址<input type="text" name="rCompanyAddress" required><br>
        公司详情<input type="text" name="rCompanyProfile" required><br>
        福利<input type="text" name="rFringeBenefits" required><br>
        薪资<input type="number" name="rSalary" required><br>
        需求<input type="text" name="rRequirements"><br>
        部门：<select id="dep" name="dId">
    <c:forEach items="${sessionScope.departmentList}" var="department">
        <option value="${department.dId}">${department.dDepartment}</option>
    </c:forEach>
</select>
        职位：<select id="pos" name="pId"></select>
        <input type="submit" value="提交"><br>
    </form>
</div>
</c:if>
<c:if test="${sessionScope.departmentList==null || fn:length(sessionScope.departmentList)==0}">
</c:if>
</body>
</html>