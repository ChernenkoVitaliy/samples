<%--
  Created by IntelliJ IDEA.
  User: unknown
  Date: 11.01.2021
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form-Based Login Page</title>
</head>
<body>
    <h1>Form-Based Login Page</h1>

    <form method="post" action="${pageContext.request.contextPath}/LoginServlet">
        Username: <input type="text" name="login"><br>
        Password: <input type="password" autocomplete="off" name="password"><br>
        <input type="submit" value="Submit" name="submitButton">
        <input type="reset" value="Reset">
    </form>

</body>
</html>
