package com.example.gupao.principle.celve2;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    public static final String ALI_PAY = "ALipay";
    public static final String JD_PAY = "JDipay";
    public static final String WECHAT_PAY = "WECHATipay";
    public static final String UNIO_PAY = "UNIONpay";
    public static final String DEFAULT_PAY = "ALipay";

    private static Map<String, PayMent> strategy = new HashMap<>();

    static {
        strategy.put(ALI_PAY,new AliPay());
        strategy.put(JD_PAY,new JDPay());
        strategy.put(WECHAT_PAY,new Wechat());
        strategy.put(UNIO_PAY,new UnionPay());
    }

    public static PayMent get(String payKey){
        if(!strategy.containsKey(payKey)){
            return strategy.get(DEFAULT_PAY);
        }
        return strategy.get(payKey);
    }
}
