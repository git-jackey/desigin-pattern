package com.javayige.state;


/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc :灯的状态
 */
public abstract class ElectricLightStatus {

    public ElectricLightContext context;

    public void setContext(ElectricLightContext context) {
        this.context = context;
    }

    /**
     * 开灯
     */
    public abstract void turnOn();

    /**
     * 关灯
     */
    public abstract void turnOff();

    /**
     * 获取开关目前的状态
     */
    public abstract String getStatus();


}