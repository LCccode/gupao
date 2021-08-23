package com.example.gupao.principle.srp;

/**
 * 单一职能原则
 * simple responsibility pinciple  -》 SRP
 *
 * 不要存在多余一个导致类变更的原因
 * 一个类，接口，方法 只负责一项职责（业务层面 最小颗粒度区分）
 */
public class Course {
    //这样 课程业务就会 耦合了 直播课 和录播课的 业务逻辑，不符合单一职能原则
    //需要把下面两个方法拆成两个独立的类来实现
    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println(courseName + "->不能快进");
        }else{
            System.out.println(courseName + "->可以反复观看");
        }

    }
}
