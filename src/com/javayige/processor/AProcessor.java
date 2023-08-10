package com.javayige.processor;


/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/10/29
 * @Desc :
 */
public class AProcessor implements ValidateBizService {
    @Override
    public boolean pass() {
        return false;
    }

    @Override
    public String handle() {
        System.out.println("AProcessor...");
        return "A";
    }
}