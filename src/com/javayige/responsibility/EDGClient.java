package com.javayige.responsibility;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/7
 * @Desc :
 */
public class EDGClient {
    public static void main(String[] args) {
        ClearLoveNode clearLoveNode = new ClearLoveNode();

        ScoutNode scoutNode = new ScoutNode();

        //指定关系 binding node
        clearLoveNode.setNext(scoutNode);

        System.out.println(clearLoveNode.handlerRequest(8));

    }
}