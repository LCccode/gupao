package com.example.gupao.principle.dip.service.impl;

import com.example.gupao.principle.dip.service.ICourse;

public class AiCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习 AI 课程");
    }
}
