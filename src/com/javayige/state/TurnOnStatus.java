package com.javayige.state;

import com.orangecy.common.exception.OrangeCyException;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc : 开- 状态
 */
public class TurnOnStatus  extends ElectricLightStatus{

    @Override
    public void turnOn() {
        throw new OrangeCyException("开关已经是打开状态" +
                "不能再打开了");
    }

    @Override
    public void turnOff() {
        super.context.setStatus(ElectricLightContext.OFF_STATUS);
    }

    @Override
    public String getStatus() {
        return "open";
    }
}