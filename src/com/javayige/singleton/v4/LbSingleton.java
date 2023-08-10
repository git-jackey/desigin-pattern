package com.javayige.singleton.v4;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-懒汉式-DCL
 */
public class LbSingleton {

    private static LbSingleton instance = null;

    private LbSingleton(){}

    /**
     *synchronized 代码块 作用懒汉
     * @return
     */
    public static LbSingleton getInstance(){
        if(null == instance) {
            synchronized (LbSingleton.class) {
                if (null == instance) {
                    instance = new LbSingleton();
                }
            }
        }
        return instance;
    }
}