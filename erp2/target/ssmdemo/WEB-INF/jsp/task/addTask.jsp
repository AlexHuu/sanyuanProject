<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/2
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<style type="text/css">
    .tg  {border-collapse:collapse;border-spacing:0;}
    .tg td{font-family:Arial, sans-serif;font-size:14px;padding:11px 20px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
    .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:11px 20px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
    .tg .tg-s6z2{text-align:center}
    .tg .tg-baqh{text-align:center;vertical-align:top}
    .tg .tg-yw4l{vertical-align:top}
</style>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>排缸</title>
    <%--<LINK href="${pageContext.request.contextPath }/resources/css/Style.css" type=text/css rel=stylesheet>--%>
    <%--<LINK href="${pageContext.request.contextPath }/resources/css/Manage.css" type=text/css rel=stylesheet>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.11.3.min.js"></script>
</head>
<body>
<div>
    <h1 style="text-align: center">闵三元染整漂染生产流程表</h1>

</div>
<div style="text-align: center">
    <form action="addTask" method="post" id="form1">
        <input name="curstate" type="hidden" value="未工作">
        <table class="tg">
            <tr>
                <th class="tg-yw4l">毛坯区号：</th>
                <th class="tg-yw4l" colspan="3"><label for="workblankno">
                    <input id="workblankno" name="workblankno" type="text" style="width:100%; height:100%;"></label></th>
                <th class="tg-yw4l">生产日期：</th>
                <th class="tg-yw4l" colspan="2"><label for="dateofproduce">
                    <input type="date" id="dateofproduce" name="dateofproduce" style="width:100%; height:100%;"></label></th>
            </tr>
            <tr align="center">
                <td class="tg-yw4l">客户：</td>
                <td class="tg-yw4l" colspan="2">${order.customer}<label for="customer">
                    <input id="customer" name="customer" type="hidden" value="${order.customer}" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l">色名：</td>
                <td class="tg-031e"><label for="colorname">
                    <input id="colorname" name="colorname" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-031e">色号：</td>
                <td class="tg-031e"><label for="colorno">
                    <input id="colorno" name="colorno" type="text" style="width:100%; height:100%;"></label></td>
            </tr>
            <tr align="center">
                <td class="tg-yw4l">缸号：</td>
                <td class="tg-yw4l" colspan="2"><label for="taskno">
                    <input id="taskno" name="taskno" type="text" style="width:100%; height:100%;" placeholder="必填"></label></td>
                <td class="tg-yw4l">订单号：</td>
                <td class="tg-031e">${order.orderno}<label for="orderno">
                    <input id="orderno" name="orderno"  type="hidden" value="${order.orderno}" style="width:100%; height:100%;"></label></td>
                <td class="tg-031e">交货期：</td>
                <td class="tg-031e"><label for="deadline">
                    <input id="deadline" name="deadline" type="date"  style="width:100%; height:100%;"></label></td>
            </tr>
            <tr>
                <td class="tg-baqh">品     种</td>
                <td class="tg-baqh">坯布克重</td>
                <td class="tg-baqh">寸     口</td>
                <td class="tg-baqh">匹      数</td>
                <td class="tg-s6z2">重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;量</td>
                <td class="tg-s6z2">门幅克重</td>
                <td class="tg-s6z2">定染类别</td>
            </tr>
            <tr>
                <td class="tg-yw4l"><label for="type">
                    <input id="type" name="type" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l"><label for="weightpercloth">
                    <input id="weightpercloth" name="weightpercloth" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l"><label for="mouse">
                    <input id="mouse" name="mouse" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l"><label for="countofclothoftask">
                    <input id="countofclothoftask" name="countofclothoftask" type="text" style="width:100%; height:100%;" placeholder="必填，小于${order.uncompleted}"></label></td>
                <td class="tg-yw4l"><label for="weightoftask">
                    <input id="weightoftask" name="weightoftask" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l"><label for="weightperdoor">
                    <input id="weightperdoor" name="weightperdoor" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-yw4l"><label for="dyetype">
                    <input id="dyetype" name="dyetype" type="text" style="width:100%; height:100%;"></label></td>
            </tr>
            <tr>
                <td class="tg-baqh">对色光源</td>
                <td class="tg-baqh" colspan="2"><label for="lightsource">
                    <input id="lightsource" name="lightsource" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-baqh">对色面</td>
                <td class="tg-baqh"><label for="lightface">
                    <input id="lightface" name="lightface" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-baqh">ph值</td>
                <td class="tg-baqh"><label for="ph">
                    <input id="ph" name="ph" type="text" style="width:100%; height:100%;"></label></td>
            </tr>
            <tr>
                <td class="tg-baqh">去油</td>
                <td class="tg-baqh" colspan="2"><label for="deoil">
                    <input id="deoil" name="deoil" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-baqh">固色</td>
                <td class="tg-baqh"><label for="fixation">
                    <input id="fixation" name="fixation" type="text" style="width:100%; height:100%;"></label></td>
                <td class="tg-baqh">抛光</td>
                <td class="tg-baqh"><label for="polish">
                    <input id="polish" name="polish" type="text" style="width:100%; height:100%;"></label></td>
            </tr>
            <tr>
                <td class="tg-baqh">色差要求</td>
                <td class="tg-baqh" colspan="2"><label for="aberration">
                    <input id="aberration" name="aberration" type="text" style="width:100%; height:100%;">
                </label></td>
                <td class="tg-baqh">检测标准</td>
                <td class="tg-baqh"><label for="detection">
                    <input id="detection" name="detection" type="text" style="width:100%; height:100%;">
                </label></td>
                <td class="tg-baqh">牢度要求</td>
                <td class="tg-baqh"><label for="fastness">
                    <input id="fastness" name="fastness" type="text" style="width:100%; height:100%;">
                </label></td>
            </tr>
            <tr>
                <td class="tg-baqh">产品用途</td>
                <td class="tg-baqh" colspan="2"><label for="application">
                    <input id="application" name="application" type="text" style="width:100%; height:100%;">
                </label></td>
                <td class="tg-baqh">浆边浆切边</td>
                <td class="tg-baqh"><label for="slice">
                    <input id="slice" name="slice" type="text" style="width:100%; height:100%;">
                </label></td>
                <td class="tg-baqh">功能性整理</td>
                <td class="tg-baqh"><label for="function">
                    <input id="function" name="function" type="text" style="width:100%; height:100%;">
                </label></td>
            </tr>
            <tr>
                <td class="tg-baqh" colspan="7">生产备注</td>
            </tr>
            <tr>
                <td class="tg-yw4l" colspan="7"><label for="remark">
                    <input id="remark" name="remark" type="text" style="width:100%; height:100%;">
                </label></td>
            </tr>
            <tr>
                <td class="tg-baqh" colspan="7">生产流程</td>
            </tr>
            <tr>
                <td class="tg-yw4l" colspan="7">
                    <input name="process" type="checkbox" value="0"/>理布1&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="1"/>坯定&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="2"/>染色&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="3"/>水洗&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="4"/>漂白&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="5"/>脱水&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="6"/>剖布&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="7"/>理布2&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="8"/>定型&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="9"/>打卷&nbsp;&nbsp;
                    <input name="process" type="checkbox" value="10"/>入库
                </td>
            </tr>

            <tr>
                <td colspan="7" align="center" class="tg-yw4l">
                    <button>提   交</button>
                </td>
            </tr>

        </table>

    </form>

</div>


</body>
</html>
