package com.example.gupao.principle.openclose;

/**
 * 开闭原则
 * java课程扩展类
 * 每一个在javacourse上要添加扩展的东西，可以再额外定义一个类
 */
public class JavaDisCountCourse extends JavaCourse{
    public JavaDisCountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 课程打六折，不要在父类方法修改属性，就拿不到父类的原价了getPrice
     * @return
     */
    public Double getDisCountPrice() {
        return super.getPrice() *0.6;
    }
}
