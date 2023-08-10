package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc : 珍珠奶茶
 */
public class PearDecorator extends AbstractLbDecorator {

    public PearDecorator(AbstractMilkTea abstractMilkTea) {
        super(abstractMilkTea);
    }

    @Override
    protected int price() {
        return super.price() + 3;
    }

    @Override
    protected String desc() {
        return super.desc() + "珍珠";
    }
}