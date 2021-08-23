package com.example.gupao.principle.celue;

public class GroupbuyStrategy implements IPromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("拼团，满20人成团，全团享受团购价格");
    }
}
