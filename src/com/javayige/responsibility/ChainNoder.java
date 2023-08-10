package com.javayige.responsibility;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/7
 * @Desc :责任链noder
 */
public abstract class ChainNoder {
    /**
     * 定义下一个节点
     */
    private ChainNoder next;

    /**
     * 处理请求
     * @param level
     * @return
     */
    public abstract boolean handlerRequest(int level);

    public ChainNoder getNext() {
        return next;
    }

    public void setNext(ChainNoder next) {
        this.next = next;
    }
}