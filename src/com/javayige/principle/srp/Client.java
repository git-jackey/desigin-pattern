package com.javayige.principle.srp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之SRP(single-responsibility-principle)
 * <p>每个class/method只负责一个职责</p>
 */
public class Client {

    public static void main(String[] args) {
        LbAction lbAction = new LbAction();
        lbAction.drink("可乐");
        lbAction.eat("米饭");
    }
}