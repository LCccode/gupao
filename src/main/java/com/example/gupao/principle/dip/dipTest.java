package com.example.gupao.principle.dip;

import com.example.gupao.principle.dip.service.impl.JavaCourse;

/**
 * 依赖倒置
 * 不依赖具体方法， 不依赖细节，只依赖抽象的接口或者类
 */
public class dipTest {
    public static void main(String[] args) {
//        Tom tom = new Tom();
//        v1
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();

//        v2 依赖抽象，依赖注入对象
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());
//        tom.study(new AiCourse());

//        v3
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();

//        v4

        Tom tom = new Tom();
        tom.setiCourse(new JavaCourse());
        tom.study();
    }
}
