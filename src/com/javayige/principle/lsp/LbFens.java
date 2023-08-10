package com.javayige.principle.lsp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :
 */
public interface LbFens {

    /**
     * 获取粉丝编号
     */
    Integer getFensNo();

    /**
     * 获取粉丝姓名
     */
    String getFensName();

    /**
     * 获取粉丝存钱罐余额
     */
    Double getPrice();

}