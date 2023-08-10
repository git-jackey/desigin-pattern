package com.javayige.processor;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/10/29
 * @Desc :
 */
public class BProcessor implements ValidateBizService {
    @Override
    public boolean pass() {
        return true;
    }

    @Override
    public String handle() {
        System.out.println("BProcessor");
        return "B";
    }
}