<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加生产者</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/resources/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/resources/css/Manage.css" type=text/css rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.11.3.min.js"></script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>

<script type="text/javascript">
	$(function () {
        <c:if test="${!empty msg}">
        	$("span.errorMessage").html("${msg}");
        	$("div.registerErrorMessageDiv").css("visibility","visible");
        </c:if>

		$("#form1").submit(function () {
			if (document.getElementById("userName").value == ""){
                $("span.errorMessage").html("请输入用户名");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
			}
            if (document.getElementById("userPassword").value == ""){
                $("span.errorMessage").html("请输入登录密码");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if (document.getElementById("repeatpassword").value == ""){
                $("span.errorMessage").html("请输入重复密码");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if (document.getElementById("repeatpassword").value != document.getElementById("userPassword").value){
                $("span.errorMessage").html("重复密码不一致");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }

            if (document.getElementById("userPhoneno").value == ""){
                $("span.errorMessage").html("请输入电话号码，用于登录");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            if (document.getElementById("userPhoneno").value.length != 11){
                $("span.errorMessage").html("请输入正确的11位电话号码");
                $("div.registerErrorMessageDiv").css("visibility","visible");
                return false;
            }
            return true;
        });
    });

</script>

<BODY>
	<FORM id=form1 name=form1 action="proaddsubmit" method=post>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/resources/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/resources/images/new_020.jpg"
						 height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/resources/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/resources/images/new_022.jpg>
						<IMG src="${pageContext.request.contextPath }/resources/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：权限管理 &gt; 添加生产者</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>

						<div class="registerErrorMessageDiv" align="center">
							<div class="alert alert-danger" role="alert">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
								<span class="errorMessage"> </span>
							</div>
						</div>

						<TABLE cellSpacing=0 cellPadding=5  border=0 align="center" class="registerTable">
							<tr>
								<td  align="right"><b>设置生产者姓名</b></td>
								<td></td>
							</tr>
							<tr>
								<td  align="right">生产者姓名：</td>
								<td colspan="3"><input id="userName" type="text" name="name" style="WIDTH: 180px" placeholder="姓名"/></td>
							</tr>
							<tr>
								<td   align="right"><b>设置登陆密码</b></td>
								<td   align="left"><b>登陆时验证，保护账号信息</b></td>
							</tr>

							<tr>
								<td  align="right">登录密码：</td>
								<td>
									<INPUT type="password" class=textbox id="userPassword" style="WIDTH: 180px" maxLength=50 name="password" placeholder="设置你的登陆密码">
								</td>
							</tr>

							<tr>
								<td  align="right">确认密码：</td>
								<td>
									<INPUT type="password" class=textbox id="repeatpassword" style="WIDTH: 180px" maxLength=50 name="repassword" placeholder="请再次输入你的密码">
								</td>
							</tr>

							<%--<TR>--%>
								<%--<td>登录密码：</td>--%>
								<%--<td>--%>
									<%--<INPUT class=textbox id="sChannel2" style="WIDTH: 180px" maxLength=50 name="password">--%>
								<%--</td>--%>
								<%--<td>联系人性别：</td>--%>
								<%--<td>--%>
									<%--<input type="radio" value="1" name="lkmGender">男--%>
									<%--<input type="radio" value="2" name="lkmGender">女--%>
								<%--</td>--%>
							<%--</TR>--%>
							<tr>
								<td   align="right"><b>设置生产者电话</b></td>
								<td></td>
							</tr>

							<TR>
								<td  align="right">生产者电话 ：</td>
								<td>
									<INPUT class=textbox id="userPhoneno" style="WIDTH: 180px" maxLength=50 name="phoneno" placeholder="11位电话号码">
								</td>
								<%--<td>联系人手机 ：</td>--%>
								<%--<td>--%>
								<%--<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="lkmMobile">--%>
								<%--</td>--%>
							</TR>
							<tr>
								<td></td>
								<td rowspan=2 align="center">
									<button>提   交</button>
									<%--<INPUT class=button id=sButton2 type=submit value="提 交 " name=sButton2>--%>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/resources/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/resources/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/resources/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/resources/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/resources/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
