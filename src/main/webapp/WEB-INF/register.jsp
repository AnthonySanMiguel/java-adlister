<%--
  Created by IntelliJ IDEA.
  User: asanmiguel
  Date: 5/1/20
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="/login.jsp" method="post">
    <label for="username-input">Username</label>
    <input type="text" id="username-input" name="usernameInput">
    <label for="password-input">Password</label>
    <input type="password" id="password-input" name="passwordInput">
    <label for="email-input">Password</label>
    <input type="email" id="email-input" name="emailInput">
    <button>Submit</button>
</form>

</body>
</html>
