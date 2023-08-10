package com.javayige.principle.isp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之ISP(interface-segregation-principle)
 */
public class Client {
    public static void main(String[] args) {
        LbFens lbFens1 = new BoyLbFens();
        lbFens1.bfm();
        lbFens1.gfs();

        LbFens lbFens2 = new GirlLbFens();
        lbFens2.bfm();
        lbFens2.gfs();
    }
}