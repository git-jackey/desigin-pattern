package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc :
 */
public class MilkTea extends AbstractMilkTea {
    @Override
    protected int price() {
        return 10;
    }

    @Override
    protected String desc() {
        return "milk tea";
    }
}