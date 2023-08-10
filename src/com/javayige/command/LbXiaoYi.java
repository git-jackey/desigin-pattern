package com.javayige.command;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/11
 * @Desc :
 */
public class LbXiaoYi {

    public List<LbCommand>  commandList = Lists.newArrayList();

    /**
     * 添加命令
     * @param command
     */
    public void addCommand(LbCommand command) {
        commandList.add(command);
    }

    /**
     * 发送命令
     */
    public void requireCommands() {
        commandList.forEach(LbCommand::execute);
        commandList.clear();
    }

}