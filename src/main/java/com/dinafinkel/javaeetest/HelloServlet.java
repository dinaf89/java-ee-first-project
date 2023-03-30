package com.dinafinkel.javaeetest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello! ";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + firstName + " " + lastName + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}