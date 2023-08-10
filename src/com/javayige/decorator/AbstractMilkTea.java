package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc : 抽象奶茶定义
 */
public abstract class AbstractMilkTea {
    /**
     * 价格
     * @return
     */
    protected abstract int price();

    /**
     * 描述
     * @return
     */
    protected abstract String desc();
}