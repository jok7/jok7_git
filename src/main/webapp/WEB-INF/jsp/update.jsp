<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2019/8/28
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>

<form method="post" action="/user/update">

    序号<input type="text" name="id" value="${users.id}"><br>
    姓名<input type="text" name="name" value="${users.name}"><br>
    年龄<input type="text" name="age" value="${users.age}"><br>
    年龄<input type="text" name="money" value="${users.money}"><br>
    地址<input type="text" name="address" value="${users.address}"><br>
    <input type="submit" value="确认修改">

</form>



</body>
</html>
