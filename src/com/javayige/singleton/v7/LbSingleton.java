package com.javayige.singleton.v7;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-饿汉式
 */
public class LbSingleton {

    private static LbSingleton instance = new LbSingleton();

    private LbSingleton(){}

    public static LbSingleton getInstance(){
        return instance;
    }
}