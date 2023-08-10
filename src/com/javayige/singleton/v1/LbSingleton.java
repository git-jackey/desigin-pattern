package com.javayige.singleton.v1;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-懒汉式
 */
public class LbSingleton {

    private static LbSingleton instance = null;

    private LbSingleton(){}

    public static LbSingleton getInstance(){
        if(null == instance) {
            instance = new LbSingleton();
        }
        return instance;
    }
}