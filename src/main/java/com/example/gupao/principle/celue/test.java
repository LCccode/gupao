package com.example.gupao.principle.celue;

import java.util.Set;

public class test {
    public static void main(String[] args) {

        Set<String> keys =PromotionFactory.getPromotionKey();

        IPromotionStrategy strategy = PromotionFactory.getPromotion("CASHBACL");
        strategy.promotion();

    }
}
