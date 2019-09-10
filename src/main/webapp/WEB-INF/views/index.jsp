<%@ page import="com.example.spring.mvc.controller.CustClassforSession" %>
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.lang.reflect.Method" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Spring MVC XML Config Example</title>
</head>
<body>

${message}
<br/>
</hr>
<spring:message htmlEscape="true" code="base.exm"/>

<%

    CustClassforSession cus = (CustClassforSession) request.getSession().getAttribute("cus");

    out.print(cus.getName());
%>
<br/>

<hr>

<%
    out.println(cus.getText());
%>
</body>
</html>
