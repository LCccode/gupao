package com.example.gupao.principle.openclose;


/**
 * java 课程类
 * **********开闭原则***********
 * 应该对扩展开放，对修改关闭
 ************
 * 如果此时出现了 java课程 打折，就不要在本类里面修改get方法 如打六折 改成 return price *0.6
 ************
 * 原来的基准类或者基准方法不要动了，在原有的类上进行扩展
 * 扩展类 JavaDiscountCourse
 */
public class JavaCourse implements ICourse{
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse() {
    }

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
