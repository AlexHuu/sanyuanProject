<%--
  Created by IntelliJ IDEA.
  User: fb
  Date: 2018/4/21
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加订单</title>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h3>
                闽三元染整漂染生产流转管理系统——添加订单
            </h3>
            <div class="row-fluid">
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="orderNo">订单号</label>
                            <div class="controls">
                                <input id="orderNo" name="orderNo" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="customer">客户</label>
                            <div class="controls">
                                <input id="customer" name="customer" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="date">日期</label>
                            <div class="controls">
                                <input id="date" name="date" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row-fluid">
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="countOfCloth">匹数</label>
                            <div class="controls">
                                <input id="countOfCloth" name="countOfCloth" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="weight">重量</label>
                            <div class="controls">
                                <input id="weight" name="weight" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="span4">
                    <form class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label" for="remarkOfCloth">品种备注</label>
                            <div class="controls">
                                <input id="remarkOfCloth" name="remarkOfCloth" type="text"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row-fluid">
                <div class="span4">
                </div>
                <div class="span4">
                    <button class="btn btn-block btn-large btn-info" type="button"
                            onclick="window.location.href='/addOrder'">添加订单
                    </button>
                </div>
                <div class="span4">
                    <button class="btn btn-block btn-large btn-info" type="button"
                            onclick="window.location.href='/updateOrder'">更新订单
                    </button>
                </div>
                <div class=" span4
                    ">
                    <button class="btn btn-block btn-large btn-info" type="button"
                            onclick="window.location.href='/getOrder'">查询订单
                    </button>
                </div>
                <div class=" span4
                    ">
                    <button class="btn btn-block btn-large btn-info" type="button"
                            onclick="window.location.href='/deleteOrder'">删除订单
                    </button>
                </div>
                <div class=" span4
                    ">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
