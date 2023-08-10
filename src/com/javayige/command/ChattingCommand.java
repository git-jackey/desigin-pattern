package com.javayige.command;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/11
 * @Desc :
 */
public class ChattingCommand implements LbCommand {
    private LbFens lbFens;

    public ChattingCommand(LbFens lbFens) {
        this.lbFens = lbFens;
    }

    @Override
    public void execute() {
        lbFens.chattingInGroup();
    }
}