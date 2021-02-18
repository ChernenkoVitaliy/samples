<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: unknown
  Date: 18.02.2021
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session-trades</title>
</head>
<body>
<h3>Message: ${msg}</h3>
<br/>
<h4>Current visitor history</h4>
<p>ip: ${visitor.ip}:</p>
<c:forEach items="${visitor.pageVisited}" var="page">
    <p>${page}</p>
</c:forEach>

<a href="<%=request.getContextPath()%>/sessionattr/trades/clear">Clear History</a>
</body>
</html>
