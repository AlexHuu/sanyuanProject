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
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
    <script src="http://apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/style.css">
    <script type="text/javascript">
        function showDetail(taskNo) {
            $.ajax({
                type:"post",
                url:"getDetailInfo",
                data:"taskNo="+taskNo,
                success:function (data) {
                    $("div.trace_content").html(data);
                }
            });
        }
    </script>
</head>
<body>
<table class="label label-info" >
    <tr align="center">
        <td>查询缸号</td>
        <form action="getTaskByTaskNo" method="post">
            <td>
                <input type="text" name="taskNo" placeholder="请输入查询的缸号" value="<%= request.getParameter("taskNo")==null ? "" : request.getParameter("taskNo")%>">
            </td>
            <td>
                <input type="submit" value="查询">
            </td>
        </form>
    </tr>
</table>
<div class="workingArea">
    <h3 class="label label-info">订单信息</h3>
    <br>
    <div class="trace_content" id="trace_content"></div>
    <br>
    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed" align="center" border="2px"
               width="100%">
            <thead>
            <tr class="success">
                <th>缸号</th>
                <th>订单号</th>
                <th>生产日期</th>
                <th>生产流程</th>
                <th>当前生产状态</th>
                <%--<th>客户名</th>--%>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${tasks}" var="task" varStatus="status">
                <p class="trace_show">
                    <tr class="tr2">
                        <td><a href="javascript:void(0)" onclick="showDetail(${task.taskno})">${task.taskno}</a></td>
                        <td>${task.orderno}</td>
                        <td><fmt:formatDate value="${task.dateofproduce}" type="date" pattern="yyyy-MM-dd"/></td>
                        <td>${task.process}</td>
                        <td>${task.curstate}</td>
                        <td>
                            <c:if test="${sessionScope.user.hasPrivilege()}">
                                <form action="deleteTask">
                                    <input  type="hidden" name="taskNo" value="${task.taskno}"/>
                                    <input type="hidden" name="orderNo" value="${task.orderno}">
                                    <input type="submit" class="button" name="operation" value="删除排缸">
                                        <%--<button value="排缸操作" type="submit"></button>--%>
                                </form>
                            </c:if>
                            <form action="printTask" method="post">
                                <input  type="hidden" name="taskNo" value="${task.taskno}"/>
                                <input type="hidden" name="orderNo" value="${task.orderno}">
                                <input type="submit" class="button" name="operation" value="打印流转卡">
                                    <%--<button value="排缸操作" type="submit"></button>--%>
                            </form>


                        </td>
                    </tr>
                </p>

            </c:forEach>
            </tbody>
        </table>
    </div>

</div>


</body>
</html>
