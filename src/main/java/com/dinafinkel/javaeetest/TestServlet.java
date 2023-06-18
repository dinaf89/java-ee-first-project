package com.dinafinkel.javaeetest;

import com.dinafinkel.javaeetest.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "TestServlet", value = "/test")
public class TestServlet extends HttpServlet {
//    @Inject
    Student student = new Student();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       student.setName("dinarik");
       System.out.println(student.getName() + "---------------");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
