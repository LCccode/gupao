package com.example.gupao.principle.openclose;

/**
 * 课程类
 * 开闭原则
 * 应该对扩展开放，对修改关闭
 * 原来的基准类或者基准方法不要动了，在原有的类上进行扩展
 */
public interface ICourse {
    Integer getId();

    String getName();

    Double getPrice();
}
