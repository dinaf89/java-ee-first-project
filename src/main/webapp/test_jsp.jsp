<%--
  Created by IntelliJ IDEA.
  User: dinarik
  Date: 30.03.2023
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Redirect_and_Forward</title>
</head>
<body>
    <h1>Test JSP</h1>
    <jsp:useBean id="cart" class="com.dinafinkel.javaeetest.bean.Cart"/>
    <jsp:setProperty name="cart" property="name" value="Dina"/>
    <jsp:getProperty name="cart" property="name" />
</body>
</html>
