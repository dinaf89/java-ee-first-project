<%@ page import="com.dinafinkel.javaeetest.bean.Cart" %>
<%@ page import="com.dinafinkel.javaeetest.bean.Product" %><%--
  Created by IntelliJ IDEA.
  User: dinarik
  Date: 30.03.2023
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <h1>MyCart</h1>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>
        <p> Name : <%= cart.getName() %> </p>
        <p> Products : <% for (Product p: cart.getProducts()) {
            out.println("<p>" + p.getName());
            out.print(p.getAmount() + "</p>");
        }
        %>
        </p>

</body>
</html>
