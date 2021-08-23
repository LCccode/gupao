package com.example.gupao.principle.dip.service.impl;


import com.example.gupao.principle.dip.service.ICourse;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习 java 课程");
    }
}
