package com.javayige.principle.dip;


/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之DIP(dependency-inversion-principle)
 */
public class Client {
    public static void main(String[] args) {
        LbFens lbFens = new LbFens();

        lbFens.setItems(new YaoXingFens());

        lbFens.buyGoods();
    }
}