package com.example.gupao.principle.celve2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单类 还需要一个切换上下文类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String uid;
    private String ordered;
    private double amount;

    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }
    public MsgResult pay(String payKey){
        PayMent payMent = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payMent.getName());
        System.out.println("本次交易金额为" + amount + " 开始扣款");
        return payMent.pay(payKey,amount);
    }
}
