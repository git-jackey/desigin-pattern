package com.javayige.template;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc : 模板模式测试类
 */
public class Client {
    public static void main(String[] args) {
        AbstractCooking ac = new MeiKoCooking();
        ac.cooking();

        System.out.println("======================");

        XiaoYiCooking xc = new XiaoYiCooking();
        xc.cooking();
    }
}