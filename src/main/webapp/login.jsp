<%--
  Created by IntelliJ IDEA.
  User: asanmiguel
  Date: 4/21/20
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="/login.jsp" method="post">
    <label for="username-input">Username</label>
    <input type="text" id="username-input" name="usernameInput">
    <label for="password-input">Password</label>
    <input type="password" id="password-input" name="passwordInput">
    <button>Submit</button>
</form>

<%
    String username = request.getParameter("usernameInput");
    String password = request.getParameter("passwordInput");
    if(username != null && password != null) {
        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("./profile.jsp");
        }
    }
%>

</body>
</html>
