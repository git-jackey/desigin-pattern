package com.javayige.command;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/11
 * @Desc : 端茶命令
 */
public class TransmitTeaCommand implements LbCommand {

    private LbFens lbFens;


    public TransmitTeaCommand(LbFens lbFens) {
        this.lbFens = lbFens;
    }

    @Override
    public void execute() {
        lbFens.transmitTea();
    }
}