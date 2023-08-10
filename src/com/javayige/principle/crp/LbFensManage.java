package com.javayige.principle.crp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc : 粉丝管理
 */
public class LbFensManage extends DbDriverEngine{
    /**
     * 新增
     */
    public void addFens(){
        String connection = super.getConnection();
        System.out.println(String.format("添加成功:%s", connection));
    }
}