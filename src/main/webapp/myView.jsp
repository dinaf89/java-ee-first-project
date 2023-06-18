<%--
  Created by IntelliJ IDEA.
  User: dinarik
  Date: 03.04.2023
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>

<%--this is analog for request.setAttribute("Student", model.getStudent()); --%>
<%--    <jsp:useBean id="Student" class="com.dinafinkel.javaeetest.bean.Student" scope="request"/>--%>
<%--&lt;%&ndash;analog for request.getSession().setAttribute("Student", model.getStudent());&ndash;%&gt;--%>
<%--    <jsp:useBean id="Student" class="com.dinafinkel.javaeetest.bean.Student" scope="session"/>--%>
<%--&lt;%&ndash;analog for request.getServletContext().setAttribute("Student", model.getStudent());&ndash;%&gt;--%>
<%--    <jsp:useBean id="Student" class="com.dinafinkel.javaeetest.bean.Student" scope="application"/>--%>

<%--expression language--%>
    ${student.name}
    ${student["name"]}
    ${student.age}
    ${student["age"]}
</body>
</html>
