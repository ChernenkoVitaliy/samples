<%--
  Created by IntelliJ IDEA.
  User: unknown
  Date: 22.02.2021
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user-registration-valid</title>
    <style>
        span.error {
            color: red;
        }
    </style>
</head>
<body>
<div>
    <h3>Registration Form</h3>
    <br/>
    <form action="register" method="post">
        <pre>
            Name:           <input type="text" name="name" value="${userDto.name}">
            <span class="error">${nameError}</span>

            Email address:  <input type="text" name="emailAddress" value="${userDto.emailAddress}">
            <span class="error">${emailAddressError}</span>

            Password:       <input type="password" name="password" value="${userDto.password}">
            <span class="error">${passwordError}</span>
                            <input type="submit" value="Submit">
        </pre>
    </form>
</div>
</body>
</html>
