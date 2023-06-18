package com.dinafinkel.javaeetest.beanvalidation;

import com.dinafinkel.javaeetest.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet(value = "/validation")
public class ValidationExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Student student = new Student("DINA", 10);
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    Set<ConstraintViolation<Student>> violations = validator.validate(student);
    PrintWriter out = resp.getWriter();
    for (ConstraintViolation<Student> violation : violations) {
        System.out.println(violation.getMessage());
    }
    }
}
