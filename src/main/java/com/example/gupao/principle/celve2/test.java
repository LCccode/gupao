package com.example.gupao.principle.celve2;

public class test {
    public static void main(String[] args) {
        Order order = new Order("1","123123210",342.5);
        System.out.println(order.pay(PayStrategy.UNIO_PAY));
//        System.out.println(order.pay(PayStrategy.UNIO_PAY));
//        System.out.println(order.pay(PayStrategy.UNIO_PAY));
    }
}
