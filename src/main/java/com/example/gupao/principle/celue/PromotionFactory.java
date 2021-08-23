package com.example.gupao.principle.celue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 单例工厂模式+ 策略模式
 * 用于处理较为庞大的if else 逻辑处理
 */
public class PromotionFactory {
    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<String,IPromotionStrategy>();

    static{
        PROMOTIONS.put(PromotionKey.COUPON,new couponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CashBackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    //空key 使用无优惠的接口实现
    private static final IPromotionStrategy empty = new EmptyStrategy();

    //返回出口
    public static IPromotionStrategy getPromotion(String kindKey) {
        IPromotionStrategy strategy = PROMOTIONS.get(kindKey);
        return strategy == null? empty:strategy;
    }
    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACL";
        String GROUPBUY ="GROUPBUY";
    }

    //客户端获取key 的入口
    public static Set<String> getPromotionKey(){
        return PROMOTIONS.keySet();
    }
}
