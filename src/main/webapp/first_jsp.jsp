
<%--
  Created by IntelliJ IDEA.
  User: dinarik
  Date: 29.03.2023
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            for (int i = 0; i <= 3; i++) {
                out.println("<p>" + "Hello Dina " + i + "</p>");
            }
        %>
    </p>
</body>
</html>
