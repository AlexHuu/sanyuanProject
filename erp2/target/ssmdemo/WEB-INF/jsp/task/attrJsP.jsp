<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/3
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>属性页面</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
    <script src="http://apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/style.css">
</head>
<body>

<div class="trace_content">
    <table id="tb1" border="1" width="100%" frame="void" rules="none">
        <tr>
            <td>毛坯区号：${task.workblankno}</td>
            <td>色名：${task.colorname}</td>
            <td>色号：${task.colorno}</td>
            <td>交货期：${task.deadline}</td>
            <td>品种：${task.type}</td>
        </tr>
        <tr>
            <td>坯布克重：${task.weightpercloth}</td>
            <td>寸口：${task.mouse}</td>
            <td>匹数：${task.countofclothoftask}</td>
            <td>重量：${task.weightoftask}</td>
            <td>门幅克重：${task.weightperdoor}</td>
        </tr>
        <tr>
            <td>定染类别：${task.dyetype}</td>
            <td>对色光源：${task.lightsource}</td>
            <td>对色面：${task.lightface}</td>
            <td>ph值：${task.ph}</td>
            <td>去油：${task.deoil}</td>
        </tr>
        <tr>
            <td>固色：${task.fixation}</td>
            <td>抛光：${task.polish}</td>
            <td>色差要求：${task.aberration}</td>
            <td>检测标准：${task.detection}</td>
            <td>牢度要求：${task.fastness}</td>
        </tr>
        <tr>
            <td>产品用途：${task.application}</td>
            <td>浆边浆切边：${task.slice}</td>
            <td>功能性整理：${task.function}</td>
            <td>生产备注：${task.remark}</td>
            <td></td>
        </tr>
    </table>
</div>


</body>
</html>
