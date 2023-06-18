package com.dinafinkel.javaeetest.model;

import com.dinafinkel.javaeetest.bean.Student;

public class MyModel {
    public Student getStudent() {
        Student student = new Student("Dina ", 33);
        return student;
    }
}
