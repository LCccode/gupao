package com.example.gupao.principle.celue;

public class CashBackStrategy implements IPromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("返现促销，返现的金额饭会到支付宝账号-!");
    }
}
