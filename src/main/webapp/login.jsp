<%--
  Created by IntelliJ IDEA.
  User: asanmiguel
  Date: 4/21/20
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<%@ include file="partials/head.jsp" %>
<%@ include file="partials/navbar.jsp" %>

    <form  method="post" action="http://localhost:8080/login.jsp">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username">
            <br>
            <br>
        <label for="password">Password:</label>
        <input type="text" id="password" name="password">
            <br>
            <br>
        <input type="submit" value="Submit">
    </form>

    <% String username = "admin";%>
    <% String password = "password";%>
    <%response.sendRedirect("http://localhost:8080/login.jsp");%>

</body>
</html>
