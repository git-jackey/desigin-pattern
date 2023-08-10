package com.javayige.principle.dip;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :
 */
public class YaoXingFens implements Items {

    @Override
    public void addIntoShoppingCat() {
        System.out.println("药星同学买了**");
    }
}