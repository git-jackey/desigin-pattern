package com.javayige.principle.lod;


/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之LOD(Law-of-Demeter-principle)
 */
public class Client {
    public static void main(String[] args) {
        SuperBoss superBoss = new SuperBoss();
        LowerCoder lowerCoder = new LowerCoder();
        superBoss.hireKeyBoardCountCheck(lowerCoder);
    }
}