package com.javayige.principle.isp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :
 */
public class BoyLbFens implements LbFens {
    @Override
    public void gfs() {
        System.out.println("i agree i am ");
    }

    @Override
    public void bfm() {
        System.out.println("i am hope gf attend that");
    }
}