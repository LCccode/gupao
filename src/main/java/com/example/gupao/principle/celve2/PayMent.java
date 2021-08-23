package com.example.gupao.principle.celve2;

/**
 * 通用 支付方法
 */
public abstract class PayMent {

    public abstract String getName();

    //通用逻辑放到抽象类中实现
    public MsgResult pay(String uid,double amounnt){
        if(queryBalance(uid) < amounnt){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付","支付成功，余额：" + (queryBalance(uid) -amounnt) );
    }

    //通用计算支付前置条件方法,用于饭会子类的 金额余额
    protected abstract double queryBalance(String uid);
}
