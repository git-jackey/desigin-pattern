package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc :
 */
public class BolloDecorator extends AbstractLbDecorator {
    public BolloDecorator(AbstractMilkTea abstractMilkTea) {
        super(abstractMilkTea);
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }

    @Override
    protected String desc() {
        return super.desc() + "菠萝";
    }
}