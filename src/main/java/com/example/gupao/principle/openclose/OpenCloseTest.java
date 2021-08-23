package com.example.gupao.principle.openclose;

public class OpenCloseTest {

    public static void main(String[] args) {
        ICourse course = new JavaCourse(1,"java架构",1000d);
        ICourse courseDiscount = new JavaDisCountCourse(1,"java架构",1000d);
        System.out.println(course.toString());
        System.out.println(((JavaDisCountCourse) courseDiscount).getDisCountPrice());
    }
}
