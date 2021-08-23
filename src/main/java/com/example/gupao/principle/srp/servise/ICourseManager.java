package com.example.gupao.principle.srp.servise;

/**
 * 根据单一职能原则拆分出的 课程管理操作接口
 */
public interface ICourseManager {
    //获得视频流
    byte[] getCourseVideo();

    //学习课程
    void studyCourse();

    //退款
    void refundCourse();
}
