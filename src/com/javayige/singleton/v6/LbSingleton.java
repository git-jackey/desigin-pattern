package com.javayige.singleton.v6;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-静态内部类
 */
public class LbSingleton {

    private static class LbSingletonHolder{
        private static LbSingleton instance = new LbSingleton();
    }

    private LbSingleton(){}

    public static LbSingleton getInstance() {
        return LbSingletonHolder.instance;
    }
}