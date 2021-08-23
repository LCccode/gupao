package com.example.gupao.principle.srp.servise;

/**
 * srp 单一职能原则
 * 先设计顶层接口 课程相关接口
 * 然后根据业务颗粒，进行拆分下面的方法
 *
 * 拆出两个接口类，修改职能互不影响
 *
 * 尽可能的 让接口 或者 方法 或者类 保持单一职责
 */
public interface ICourse {
    //获取基本信息
    String getCourseName();

    //获得视频流
    byte[] getCourseVideo();

    //学习课程
    void studyCourse();

    //退款
    void refundCourse();
}
