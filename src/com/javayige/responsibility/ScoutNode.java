package com.javayige.responsibility;

import java.util.Objects;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/7
 * @Desc :
 */
public class ScoutNode extends ChainNoder{

    @Override
    public boolean handlerRequest(int level) {
        if(level >5 && level <=8) {
            System.out.println("处理不了");
            return true;
        }
        System.out.println("scout收到指令开始处理");
        ChainNoder next = getNext();
        if(Objects.isNull(next)) {
            return false;
        }
        return getNext().handlerRequest(level);
    }
}