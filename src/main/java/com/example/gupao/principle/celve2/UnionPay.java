package com.example.gupao.principle.celve2;

public class UnionPay extends PayMent {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 380;
    }
}
