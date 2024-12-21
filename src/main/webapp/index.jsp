<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<s:fielderror/>
<div>
    <form action="test/login" method="post">
    姓名<input type="text"  name="name"><br>
    性别<input type="text"  name="gender"><br>
    电话<input type="text"  name="tel"><br>
    <input type="submit" value="login">
    </form>
</div>

</body>
</html>