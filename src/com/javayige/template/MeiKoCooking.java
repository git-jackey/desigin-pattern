package com.javayige.template;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc :
 */
public class MeiKoCooking extends AbstractCooking {
    @Override
    protected boolean needChoppedLittleOnion() {
        return false;
    }

    @Override
    protected void washPot() {
        System.out.println("我meiko 不洗锅===");
    }
}