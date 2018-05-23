<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2018-04-23
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/style.css">
</head>
<body>

<%--<a href="/erp/testentry" >测试</a>--%>
<script type="text/javascript">



</script>
<table >
    <tr align="center">
        <td>客户名</td>
        <td>开始日期</td>
        <td>结束日期</td>
    </tr>
    <tr align="center">
        <form action="queryorder" method="post">
            <td>
                <input type="text" name="customerName" placeholder="请输入查询的客户名">
            </td>
            <td>
                <input type="date" id="from" name="startDate" placeholder="开始时间" value=<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>>
            </td>
            <td>
                <input type="date" id="to" name="endDate" placeholder="结束时间" value=<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>>
            </td>
            <td>
                <input type="submit">
            </td>
        </form>
    </tr>
</table>
<%--list--%>
<div class="workingArea">
    <h1 class="label label-info">订单信息</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed" align="center" border="2px" width="100%">
            <thead>
            <tr class="success">
                <th>订单号</th>
                <th>客户名</th>
                <th>日期</th>
                <th>匹数</th>
                <th>重量</th>
                <th>未完成匹数</th>
                <th>品种备注</th>
                <th>操作</th>
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
                    <td>
                        <form action="taskOperation">
                            <input  type="hidden" name="orderNo" value="${order.orderno}"/>
                            <input type="submit" class="button" name="operation" value="排缸操作">
                            <%--<button value="排缸操作" type="submit"></button>--%>
                        </form>
                        <%--<form action="taskUpdate">--%>
                            <%--<input type="button" name="update" value="修改订单">--%>
                        <%--</form>--%>
                        <form action="deleteOrder">
                            <input  type="hidden" name="orderNo" value="${order.orderno}"/>
                            <input type="button" name="delete" value="删除订单">
                        </form>
                    </td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
<%--list--%>


</body>
</html>
