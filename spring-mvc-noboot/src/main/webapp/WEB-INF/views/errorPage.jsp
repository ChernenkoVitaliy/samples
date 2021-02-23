<%--
  Created by IntelliJ IDEA.
  User: unknown
  Date: 23.02.2021
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>errorPage</title>
</head>
<body>
<div>
    <h3>This is custom exception page.</h3>
    <p>Exception type: <b>${exception['class'].simpleName}</b></p>
    <p>Exception Message: <b>${exception.message}</b></p>
</div>
</body>
</html>
