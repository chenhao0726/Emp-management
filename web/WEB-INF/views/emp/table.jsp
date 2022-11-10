<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/9
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%--width: 800px; height: 500px; background: #eee; border: 1px solid rgb(204, 204, 204); position: absolute; left: 50%;top: 50%; transform: translate(-50%,-50%);--%>
<%--style="padding: 50px 50px 100px 100px"--%>
<div class="table-responsive" style="padding: 50px 50px 100px 100px;">
    <%--table-sm--%>

    <table class="table table-sm table-bordered table-hover" style="text-align: center">
        <thead>
        <tr>
            <th scope="col">编号</th>
            <th scope="col">名称</th>
            <th scope="col">密码</th>
            <th scope="col">年纪</th>
            <th scope="col">性别</th>
            <th scope="col">电话</th>
            <th scope="col">工资</th>
            <th scope="col">地址</th>
            <th scope="col" style="width: 110px;">操作</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach	items="${list}" var="e">
            <tr>
                <td scope="row">${e.id}</td>
                <td>${e.name}</td>
                <td>${e.password}</td>
                <td>${e.age}</td>
                <td>${e.gender==0?"女":"男"}</td>
                <td>${e.phone}</td>
                <td>${e.salary}</td>
                <td>${e.address}</td>
                <td>
                    <%--<input type="button" class="btn btn-sm btn-info" value="修改" style="font-size: 7px;">
                    <input type="button" class="btn btn-sm btn-danger" value="删除" style="font-size: 7px;">--%>

                    <a href="/emp/update?type=save&id=${e.id}" class="btn btn-sm btn-info" role="button" aria-pressed="true" style="font-size: 7px;">修改</a>
                    <%--<button type="button" class="btn btn-primary btn-sm btn-danger" data-toggle="modal" data-target="#exampleModal" style="font-size: 7px;" onclick="values(id=${e.id})" value="id=${e.id}">
                        删除
                    </button>--%>
                    <input type="button" class="btn btn-primary btn-sm btn-danger" data-toggle="modal" data-target="#exampleModal" style="font-size: 7px;" value="删除" onclick="values('${e.id}')">
<%--                    <a href="/emp/delete?type=delete" class="btn btn-sm btn-danger" role="button" aria-pressed="true" style="font-size: 7px;">删除</a>--%>
                </td>
                <%--<td><a href="">修改</a>|<a href="">删除</a></td>--%>
            </tr>
            </c:forEach>
    </table>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">提示</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="hidden" id="id" name="id" value="">
                确定要删除<span id="use"></span>的数据吗？
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
<%--                <button type="button" id="id2" name="id" class="btn btn-primary" value="">确定</button>--%>
                <%--<input οnclick="window.location.href='wechatSys/text.action'" type="button" value="注册">--%>
                <a href="#" onclick="deleteId()" id="deleteSure" class="btn btn-primary" role="button">确认</a>
            </div>
        </div>
    </div>
</div>

<script>
    $("#exampleModal").modal("hide");
    function values(ID){
        $("#id").val(ID);
        document.getElementById('use').innerText='id='+ID;
    }

    function deleteId(){
        var id = document.getElementById('id').value;
        document.getElementById('use').innerText='id='+id;
        document.getElementById('deleteSure').href='/emp/delete?type=delete&id='+id;
    }
</script>
</body>
</html>
