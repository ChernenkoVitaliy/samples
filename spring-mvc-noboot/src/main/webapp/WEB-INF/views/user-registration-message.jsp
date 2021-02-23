<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user-registration-message</title>
    <style>
        span.error {
            color: red;
            display: inline-block;
        }
    </style>
</head>
<body>
<div>
    <h3>Registration Form</h3>
    <br/>
    <frm:form action="messagebeanvalid" method="post" modelAttribute="user">
        <pre>
            Name:           <frm:input path="name" />
            <frm:errors path="name" cssClass="error"/>

            Email address:  <frm:input path="emailAddress" />
            <frm:errors path="emailAddress" cssClass="error" />

            Password:       <frm:password path="password" />
            <frm:errors path="password" cssClass="error" />

                            <input type="submit" value="Submit">
        </pre>
    </frm:form>
</div>
</body>
</html>
