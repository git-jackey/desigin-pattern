package com.javayige.principle.crp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之CRP(corodisn-repeat-principle)
 * <p>一个类使用另一个类的代码、方法，尽量使用合成、而不是继承</p>
 */
public class Client {

    public static void main(String[] args) {
        //定义
        LbFensManage lbFensManage = new LbFensManage();

        lbFensManage.addFens();
    }
}