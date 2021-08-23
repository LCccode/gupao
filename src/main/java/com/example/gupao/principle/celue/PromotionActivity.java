package com.example.gupao.principle.celue;

/**
 * 策略模式上下文
 */
public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    //上下文的执行方法
    public void excute(){
        strategy.promotion();
    }
}
