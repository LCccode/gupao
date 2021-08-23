package com.example.gupao.principle.srp.servise;

/**
 * 根据单一职能原则拆分出的 课程信息接口
 *
 * **** 如果之后需要对课程信息增加操作或者增加接口
 * 只需要在本职责 接口中增加即可，不影响课程其他职能的接口
 */
public interface ICourseInfo{
    //获取基本信息
    String getCourseName();
}
