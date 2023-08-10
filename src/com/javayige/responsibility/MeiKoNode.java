package com.javayige.responsibility;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/7
 * @Desc :
 */
public class MeiKoNode extends ChainNoder {
    @Override
    public boolean handlerRequest(int level) {
        System.out.println(level);
        return true;
    }
}