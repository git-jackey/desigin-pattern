package com.javayige.singleton.v2;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-懒汉式
 */
public class LbSingleton {

    private static LbSingleton instance = null;

    private LbSingleton(){}

    /**
     * synchronized关键字 作用懒汉
     * @return
     */
    public static synchronized LbSingleton getInstance(){
        if(null == instance) {
            instance = new LbSingleton();
        }
        return instance;
    }
}