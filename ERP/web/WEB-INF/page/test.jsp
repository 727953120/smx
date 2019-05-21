<%--
  Created by IntelliJ IDEA.
  User: 72795
  Date: 2019/5/20
  Time: 9:07
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
    var pro=["河南","山东","黑龙江"];
    var city=[["郑州","开封","新政","濮阳","平顶山","洛阳","三门峡"],["济南","日照","烟台","德州","聊城"],["哈尔滨","齐齐哈尔","佳木斯","牡丹江"]];
    $(function(){//初始化省份下拉列表
         for(var i=0;i<pro.length;i++){
          $("#province").append($("<option></option>").val(i+1).html(pro[i]));            }
     $("#province").change(function(){
         var index=$(this).val()-1;
         $("#city").prop("length",1);
         for(var i=0;i<city[index].length;i++){
             $("#city").append($("<option></option>").val(i+1).html(city[index][i]));
         }
     });
    });

</script>
<div style="height: 200px;width: 300px;background-color: aquamarine;text-align: center" id="div1">        <select id="province">            <option value="0" selected>-请选择-</option>        </select>省        <select id="city">            <option value="0" selected>-请选择-</option>        </select>市    </div>
</body>
</html>