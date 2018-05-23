<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2018-04-23
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="jqueryui/style.css">
</head>
<body>

<table>
    <tr>
        <td>

            <form action="/erp/queryorder" method="get" >
                <input type="text" name="customerName">
                <label for="from">从</label>
                <input type="date" id="from" name="startDate">
                <label for="to">到</label>
                <input type="date" id="to" name="endDate">
                <input type="submit">
            </form>
        </td>
    </tr>

    <tr>
        <td>
            <form action="/erp/insertorder" method="get" >
                <input type="text" name="customer">
                <input type="date" name="date">
                <input type="text" name="countofcloth">
                <input type="text" name="weight">
                <input type="text" name="uncompleted">
                <input type="text" name="remarkoftype">
                <input type="submit">
            </form>

        </td>
    </tr>


    <tr>
        <td>
            <form action="/erp/inserttask" method="get">
                <input type="text" name="taskno" />
                <input type="text" name="orderno" />
                <input type="checkbox" value="libu" name="process">理布
                <input type="checkbox" value="peiding" name="process">柸定
                <input type="checkbox" value="ranse" name="process">染色
                <input type="submit" />
            </form>
        </td>
    </tr>

    <tr>
        <td>
            <form action="/erp/gettaskbytaskno" method="get">
                <input type="text" name="taskno">
                <input type="text" name="orderno">
                <input type="submit">
            </form>
        </td>
    </tr>

</table>



</body>
</html>
