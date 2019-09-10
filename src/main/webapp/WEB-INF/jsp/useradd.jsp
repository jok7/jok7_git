<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2019/8/28
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>

<form method="post" action="/user/add">

    序号<input type="text" name="id" value="id"><br>
    姓名<input type="text" name="name" value="name"><br>
    年龄<input type="text" name="age" value="age"><br>
    年龄<input type="text" name="money" value="moeny"><br>
    地址<input type="text" name="address" value="address"><br>
    <input type="submit" value="添加">

</form>

</body>
</html>
