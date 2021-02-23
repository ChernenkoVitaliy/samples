<%--
  Created by IntelliJ IDEA.
  User: unknown
  Date: 22.02.2021
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user-registration</title>
</head>
<body>
<div>
    <h3>Registration Form</h3>
    <br/>
    <form action="register" method="post">
        <pre>
            Name:           <input type="text" name="name">
            Email address:  <input type="text" name="emailAddress">
            Password:       <input type="password" name="password">
                            <input type="submit" value="Submit">
        </pre>
    </form>

</div>
</body>
</html>
