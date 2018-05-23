<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/5
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>操作</title>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/jqueryui/style.css">
</head>

<script type="text/javascript" language="javascript">
    $(document).ready(function () {
        if (${processed[0]}) {
            $("#i2").attr("disabled","disabled");
            $("#di2").css("color","red");
        }
        if (${processed[1]}){
            $("#i3").attr("disabled","disabled");
            $("#di3").css("color","red");
        }
        if (${processed[2]}){
            $("#i4").attr("disabled","disabled");
            $("#di4").css("color","red");
        }
        if (${processed[3]}){
            $("#i5").attr("disabled","disabled");
            $("#di5").css("color","red");
        }
        if (${processed[4]}){
            $("#i6").attr("disabled","disabled");
            $("#di6").css("color","red");
        }
        if (${processed[5]}){
            $("#i7").attr("disabled","disabled");
            $("#di7").css("color","red");
        }
        if (${processed[6]}){
            $("#i8").attr("disabled","disabled");
            $("#di8").css("color","red");
        }
        if (${processed[7]}){
            $("#i9").attr("disabled","disabled");
            $("#di9").css("color","red");
        }
        if (${processed[8]}){
            $("#i10").attr("disabled","disabled");
            $("#di10").css("color","red");
        }
        if (${processed[9]}){
            $("#i11").attr("disabled","disabled");
            $("#di11").css("color","red");
        }
        if (${processed[10]}){
            $("#i12").attr("disabled","disabled");
            $("#di12").css("color","red");
        }

        var curent = $.trim(${task.curstate});
        if (curent === "0"){
            $("#span1").text("理布1");
        }else if (curent === "1") $("#span1").text("坯定");
        else if (curent === "2") $("#span1").text("染色");
        else if (curent === "3") $("#span1").text("水洗");
        else if (curent === "4") $("#span1").text("漂白");
        else if (curent === "5") $("#span1").text("脱水");
        else if (curent === "6") $("#span1").text("剖布");
        else if (curent === "7"){
            $("#span1").text("理布2");
        } else if (curent === "8"){
            $("#span1").text("定型");
        }
        else if (curent === "9") $("#span1").text("打卷");
        else if (curent === "10") $("#span1").text("入库");
    });
    $(function () {
        $("#form1").submit(function () {
            if (!document.getElementById("i2").checked &&
                !document.getElementById("i3").checked &&
                !document.getElementById("i4").checked &&
                !document.getElementById("i5").checked &&
                !document.getElementById("i6").checked &&
                !document.getElementById("i7").checked &&
                !document.getElementById("i8").checked &&
                !document.getElementById("i9").checked &&
                !document.getElementById("i10").checked &&
                !document.getElementById("i11").checked &&
                !document.getElementById("i12").checked){
                alert("请选择操作！！！");
                return false;
            }
            return true;
        });
    });


</script>

<body>

<div>
    <div>
        <br>
        <h1 align="center">当前状态： <span id="span1"></span></h1>
    </div>
    <div align="center">
        <form id="form1" method="post" action="producer_pro">
            <input type="hidden" id="i1" name="taskno" value="${task.taskno }">
            <table style="color:green">
                <tr>
                    <td class="tg-yw4l">
                        <div style="display: ${isProcess[0]?"block":"none"}" id="di2">
                            <input name="process" id="i2" type="radio" value="0" >理布1
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[1]?"block":"none"}" id="di3">
                            <input name="process" id="i3" type="radio" value="1" >坯定
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[2]?"block":"none"}" id="di4">
                            <input name="process" id="i4" type="radio" value="2" >染色&nbsp;&nbsp;
                        </div>
                    </td>
                    <td>
                        <div  style="display: ${isProcess[3]?"block":"none"}" id="di5">
                            <input name="process" id="i5" type="radio" value="3" >水洗&nbsp;&nbsp;
                        </div>
                    </td>
                    <td>
                        <div style="display: ${isProcess[4]?"block":"none"}" id="di6">
                            <input name="process" id="i6" type="radio" value="4" >漂白
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[5]?"block":"none"}" id="di7">
                            <input name="process" id="i7" type="radio" value="5"  >脱水
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[6]?"block":"none"}" id="di8">
                            <input name="process" id="i8" type="radio" value="6" >剖布&nbsp;&nbsp;
                        </div>
                    </td>
                    <td>
                        <div style="display: ${isProcess[7]?"block":"none"}" id="di9">
                            <input name="process" id="i9" type="radio" value="7"  >理布2
                        </div>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[8]?"block":"none"}" id="di10">
                            <input name="process" id="i10" type="radio" value="8"  >定型
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[9]?"block":"none"}" id="di11">
                            <input name="process" id="i11" type="radio" value="9"   >打卷
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div style="display: ${isProcess[10]?"block":"none"}" id="di12">
                            <input name="process" id="i12" type="radio" value="10"  >入库
                        </div>
                    </td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
            <br>
            <button>提 交</button>
        </form>
    </div>


</div>

</body>
</html>
