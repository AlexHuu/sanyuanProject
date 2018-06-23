<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2018-04-23
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/style.css">

</head>
<body>
<table>
    <tr align="center">
        <td align="center">
            用户名
        </td>
        <td>
            匹数
        </td>
        <td>重量</td>
        <td>品种备注</td>
    </tr>
    <tr>
        <form action="insertorder" method="post">
            <td>
                <input type="text" name="customer" placeholder="请输入用户名">
            </td>
            <td>
                <input type="text" name="countofcloth" placeholder="请输入匹数">
            </td>
            <td>
                <input type="text" name="weight" placeholder="请输入重量">
            </td>
            <td>
                <input type="text" name="remarkoftype" placeholder="品种备注">
            </td>
            <td>
                <input type="submit" value="添加">
            </td>
        </form>
    </tr>
</table>

<%--list--%>
<div class="workingArea">
    <h3 class="label label-info">订单信息</h3>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed" align="center" border="2px"
               width="100%">
            <thead>
            <tr class="success">
                <th>订单号</th>
                <th>客户名</th>
                <th>日期</th>
                <th>匹数</th>
                <th>重量</th>
                <th>未完成匹数</th>
                <th>品种备注</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${ordertable}" var="order">
                <tr>
                    <td>${order.orderno}</td>
                    <td>${order.customer}</td>
                    <td><fmt:formatDate value="${order.date}" type="date"/></td>
                    <td>${order.countofcloth}</td>
                    <td>${order.weight}</td>
                    <td>${order.uncompleted}</td>
                    <td>${order.remarkoftype}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
<%--list--%>


</body>
</html>
