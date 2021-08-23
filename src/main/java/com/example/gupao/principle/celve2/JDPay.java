package com.example.gupao.principle.celve2;

public class JDPay extends PayMent{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
