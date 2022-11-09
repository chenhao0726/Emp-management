<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="../styles/formui.css" />
    <link rel="stylesheet" type="text/css" href="../styles/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="../styles/base.css"/>
    <script type="text/javascript" src="../scripts/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="../scripts/jquery-ui-1.8.22.custom.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../styles/ui-lightness/jquery-ui-1.8.22.custom.css" />
    <script type="text/javascript">
        $(function () {
            $('#center').hide();
            $('#bottom').hide();
            $('.top-next').click(function () {
                $('#top').hide();
                $('#center').show();
            })
            $('.center-next').click(function () {
                $('#center').hide();
                $('#bottom').show();
            })
            $('.center-prev').click(function () {
                $('#center').hide();
                $('#top').show();
            })
            $('.bottom-prev').click(function () {
                $('#bottom').hide();
                $('#center').show();
            })
        })
    </script>
    <style type="text/css">
        .auto-style1 {
            height: 26px;
        }
    </style>
</head>
<body>
    <div class="alert alert-info">当前位置<b class="tip"></b>员工管理<b class="tip"></b>数据查看</div>
    <table class="tb" id="top">
        <thead>
            <tr >
                <th>编号</th>
                <th>名称</th>
                <th>密码</th>
                <th>年纪</th>
                <th>性别</th>
                <th>电话 </th>
                <th>工资</th>
                <th>地址 </th>
                <th>操作 </th>
            </tr>
        </thead>
        <tbody>
            <c:forEach	items="${list}" var="e">
            	<tr>
            		<td>${e.id}</td>
            		<td>${e.name}</td>
                    <td>${e.password}</td>
            		<td>${e.age}</td>
            		<td>${e.gender==0?"男":"女"}</td>
                    <td>${e.phone}</td>
                    <td>${e.salary}</td>
            		<td>${e.address}</td>
            		<td><a href="">修改</a>|<a href="">删除</a></td>
            	</tr>
            </c:forEach>
            <tr class="tr_pagenumber">
                <td colspan="100">
                    <input class="btn top-next" id="find" type="button" value="下一步" /></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
