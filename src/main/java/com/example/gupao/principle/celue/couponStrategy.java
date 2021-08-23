package com.example.gupao.principle.celue;

public class couponStrategy implements IPromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("领取优惠卷");
    }
}
