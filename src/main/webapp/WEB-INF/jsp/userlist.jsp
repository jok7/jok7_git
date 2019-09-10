<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2019/8/28
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table>

    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>存款</td>
        <td>地址</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${lists}" var="l" varStatus="v">

    <tr>
        <td>${v.count}</td>
        <td>${l.name}</td>
        <td>${l.age}</td>
        <td>${l.money}</td>
        <td>${l.address}</td>
        <td>
            <a href="/user/delete?id=${l.id}">删除</a>
            <a href="/user/selectbyid?id=${l.id}">修改</a>
        </td>
    </tr>

    </c:forEach>

</table>

</body>
</html>
