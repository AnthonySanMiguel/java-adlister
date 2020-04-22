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

<%--<c:choose>--%>

<%--    <c:when test="${param.username == 'admin' && param.password == 'password'}">--%>
<%--        <c:redirect url="./profile.jsp">--%>
<%--            <c:param name="username" value="${param.username}"> </c:param>--%>
<%--            <c:param name="password" value="${param.password}"> </c:param>--%>
<%--        </c:redirect>--%>
<%--    </c:when>--%>

<%--    <c:otherwise>--%>
<%--        <h1>User Login</h1>--%>
<%--        <h2>Username: ${param.username}</h2>--%>
<%--        <h2>Password: ${param.Password}</h2>--%>

<%--        <form method="post" action="./login.jsp">--%>
<%--            <label for="username">Username:</label>--%>
<%--            <input type="text" id="username" name="username" required><br><br>--%>

<%--            <label for="password">Password:</label>--%>
<%--            <input type="text" id="password" name="password" required><br><br>--%>

<%--            <input type="submit" value="Submit">--%>
<%--        </form>--%>

<%--        <c:redirect url="./profile.jsp"> </c:redirect>--%>
<%--    </c:otherwise>--%>

<%--</c:choose>--%>
