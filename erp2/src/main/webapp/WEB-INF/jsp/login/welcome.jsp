<%--
  Created by IntelliJ IDEA.
  User: fb
  Date: 2018/4/20
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<h1>欢迎${user.name}</h1>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="row-fluid">
                <div class="span12">
                    <h3>
                        闽三元染整漂染生产流转管理系统
                    </h3>
                </div>
            </div>
            <div class="row-fluid">
                <div class="span4">
                </div>
                <div class="span2">
                    <h3>
                        订单管理
                    </h3>
                </div>
                <div class="span2">
                    <button class="btn btn-large btn-info" type="button"
                            onclick="window.location.href='/orderManager'">进入
                    </button>
                </div>
                <div class="span4">
                </div>
            </div>
            <div class="row-fluid">
                <div class="span4">
                </div>
                <div class="span2">
                    <h3>
                        生产管理
                    </h3>
                </div>
                <div class="span2">
                    <button class="btn btn-large btn-info" type="button">进入</button>
                </div>
                <div class="span4">
                </div>
            </div>
            <div class="row-fluid">
                <div class="span4">
                </div>
                <div class="span2">
                    <h3>
                        权限管理
                    </h3>
                </div>
                <div class="span2">
                    <button class="btn btn-large btn-info" type="button">进入</button>
                </div>
                <div class="span4">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
