package com.javayige.command;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/11
 * @Desc :
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，
 * 该对象执行命令。
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 定义粉丝 对象
         */
        LbFens lbFens1 = new LbFens("Lany");
        LbFens lbFens2 = new LbFens("李");
        /**
         * 定义操作命令 与 对象 关联
         */
        LbCommand transmitTeaCommand = new TransmitTeaCommand(lbFens1);
        LbCommand chattingCommand = new ChattingCommand(lbFens2);
        /**
         * 定义命令指派对象
         */
        LbXiaoYi lbXiaoYi = new LbXiaoYi();
        /**
         * 赋含指派对象命令权限
         */
        lbXiaoYi.addCommand(transmitTeaCommand);
        lbXiaoYi.addCommand(chattingCommand);
        /**
         * 执行
         */
        lbXiaoYi.requireCommands();
    }
}