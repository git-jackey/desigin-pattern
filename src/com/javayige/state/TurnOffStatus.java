package com.javayige.state;

import com.orangecy.common.exception.OrangeCyException;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc : 开- 状态
 */
public class TurnOffStatus extends ElectricLightStatus{

    @Override
    public void turnOn() {
        super.context.setStatus(ElectricLightContext.ON_STATUS);
    }

    @Override
    public void turnOff() {
        throw new OrangeCyException("开关已经是关闭状态" +
                "不能再关闭了");
    }

    @Override
    public String getStatus() {
        return "close";
    }
}