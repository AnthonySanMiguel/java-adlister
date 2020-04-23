<%--
  Created by IntelliJ IDEA.
  User: asanmiguel
  Date: 4/23/20
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ad Show Page"/>
    </jsp:include>
    <title></title>
</head>
<body>

<!-- This is where all the content for the Ad Show page will go -->

<jsp:include page="../partials/navbar.jsp"/>

<div class="container">

    <!-- userId of our Ad -->
    <p>User ID: ${ad.userId}</p>

    <!-- Title of our Ad -->
    <h3>Title: ${ad.title}</h3>

    <!-- Description of our Ad -->
    <h3>Description:</h3>
    <p>${ad.description}</p>

</div>
</body>
</html>
