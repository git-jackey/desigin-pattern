package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc :
 */
public abstract class AbstractLbDecorator extends AbstractMilkTea {

    private AbstractMilkTea abstractMilkTea;

    public AbstractLbDecorator(AbstractMilkTea abstractMilkTea) {
        this.abstractMilkTea = abstractMilkTea;
    }

    @Override
    protected String desc(){
        return abstractMilkTea.desc();
    }

    @Override
    protected int price(){
        return abstractMilkTea.price();
    }
}