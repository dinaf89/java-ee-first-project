package com.dinafinkel.javaeetest.controller;

import com.dinafinkel.javaeetest.model.MyModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MyController", value = "/MyController")
public class MyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyModel model = new MyModel();
        request.setAttribute("student", model.getStudent());
//        request.getSession().setAttribute("Student", model.getStudent());
//        request.getServletContext().setAttribute("Student", model.getStudent());
        RequestDispatcher dispatcher = request.getRequestDispatcher("myView.jsp");
        dispatcher.forward(request, response);
    }

}
