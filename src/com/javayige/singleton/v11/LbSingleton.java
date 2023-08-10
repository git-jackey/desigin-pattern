package com.javayige.singleton.v11;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-线程副本
 */
public class LbSingleton {

    private static final ThreadLocal<LbSingleton> THREAD_LOCAL =
            ThreadLocal.withInitial(LbSingleton::new);

    private LbSingleton(){}

    public static LbSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}