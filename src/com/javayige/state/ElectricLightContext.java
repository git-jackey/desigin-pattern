package com.javayige.state;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc :
 */
public class ElectricLightContext {
    /**
     * 目标状态类 - 委托
     */
    private ElectricLightStatus status;

    public ElectricLightStatus getStatus(){
        return status;
    }

    public void setStatus(ElectricLightStatus status) {
        this.status = status;
        this.status.setContext(this);
        System.out.println("设置开关状态生效");
    }


    public final static TurnOnStatus ON_STATUS = new TurnOnStatus();

    public final static TurnOffStatus OFF_STATUS = new TurnOffStatus();

    /**
     * 开灯
     */
    public void turnOn(){
        status.turnOn();
        System.out.println("打开成功");

    }

    /**
     * 关灯
     */
    public void turnOff(){
        status.turnOff();
        System.out.println("关闭成功");
    }
}