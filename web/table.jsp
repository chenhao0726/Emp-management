<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/9
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="table-responsive" style="padding: 50px 50px 100px 100px">
    <table class="table table-sm table-bordered table-hover">
        <thead>
        <tr>
<%--            <th scope="col">#</th>--%>
<%--            <th scope="col">First</th>--%>
<%--            <th scope="col">Last</th>--%>
<%--            <th scope="col">Handle</th>--%>

            <th scope="col">编号</th>
            <th scope="col">名称</th>
            <th scope="col">密码</th>
            <th scope="col">年纪</th>
            <th scope="col">性别</th>
            <th scope="col">电话</th>
            <th scope="col">工资</th>
            <th scope="col">地址</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach	items="${list}" var="e">
            <tr>
                <td scope="row">${e.id}</td>
                <td>${e.name}</td>
                <td>${e.password}</td>
                <td>${e.age}</td>
                <td>${e.gender==0?"男":"女"}</td>
                <td>${e.phone}</td>
                <td>${e.salary}</td>
                <td>${e.address}</td>
                <td>
                    <input type="button" class="btn btn-sm btn-info" value="修改" style="font-size: 10px;">
                    <input type="button" class="btn btn-sm btn-danger" value="删除" style="font-size: 10px;">
                </td>
                <td><a href="">修改</a>|<a href="">删除</a></td>
            </tr>
            </c:forEach>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>Otto</td>
            <td>@mdo</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>Otto</td>
            <td>@mdo</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>Larry</td>
            <td>the Bird</td>
            <td>@twitter</td>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>Otto</td>
            <td>@mdo</td>
        </tr>
    </table>
</div>
</body>
</html>
