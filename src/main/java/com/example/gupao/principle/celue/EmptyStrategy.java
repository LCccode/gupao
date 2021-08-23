package com.example.gupao.principle.celue;

public class EmptyStrategy implements IPromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("无优惠券");
    }
}
