package com.example.gupao.principle.celve2;

public class Wechat extends PayMent{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 260;
    }
}
