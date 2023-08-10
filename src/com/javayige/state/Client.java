package com.javayige.state;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc : 状态模式测试类
 * 下单 - 物流 运输
 * 待支付状态 / 购物车状态 / 支付中状态 / 已支付 已取消
 * 包裹 待运输 / 运输中 / 到站(中转/菜鸟驿站) / 待派送
 * 派送中/ 已签收 /申诉中, 已退回。
 * if(preStatus == xxx) {
 *     then set status
 * }
 */
public class Client {
    public static void main(String[] args) {
        ElectricLightContext context = new ElectricLightContext();
        //开始是打开状态
        context.setStatus(new TurnOnStatus());
        //打开开关
        context.turnOff();
        ////打开开关
        //context.turnOff();
    }
}