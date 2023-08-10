package com.javayige.decorator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/27
 * @Desc : 装饰器设计模式
 */
public class Client {
    public static void main(String[] args) {
        //定义奶茶
        AbstractMilkTea milkTea = new MilkTea();
        //珍珠
        milkTea = new PearDecorator(milkTea);
        //菠萝
        milkTea = new BolloDecorator(milkTea);
        System.out.println("价格:" + milkTea.price());
    }

}