package com.example.gupao.principle.celve2;

public class AliPay extends PayMent{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
