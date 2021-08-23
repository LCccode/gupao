package com.example.gupao.principle.dip;

import com.example.gupao.principle.dip.service.ICourse;

/**
 * 依赖倒置原则
 * 高层模块不应该依赖低层模块
 * 高层模块： 调用方法方
 * 低层模块： 方法提供方
 *
 * 抽象不应该以来细节
 * 细节应该依赖于抽象
 */
public class Tom {
    /**
     * 方法一旦改动，调用方法的地方都会收到影响
     */
//    v1 版本，单独针对业务功能生成方法，依赖细节
//    public void studyJavaCourse(){
//        System.out.println("tom 正在学习java 课程");
//    }
//    public void studyPythonCourse(){
//        System.out.println("tom 正在学习python 课程");
//    }

//    v2版本，依赖抽象，icourse 接口
//    public void study(ICourse iCourse){
//        iCourse.study();
//    }

//    v3 通过构造方法进行依赖
//    private ICourse iCourse;
//    public Tom(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void study(){
//        iCourse.study();
//    }


//    v4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        this.iCourse.study();
    }
}

