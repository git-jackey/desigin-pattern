package com.javayige.iterator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public class Client {

    public static void main(String[] args) {
        //定义粉丝
        LbFens theShy = LbFens.builder().nickName("theShy").fansSex("boy").build();
        LbFens faker = LbFens.builder().nickName("faker").fansSex("boy").build();
        LbFens rookie = LbFens.builder().nickName("rookie").fansSex("boy").build();
        LbFens mlxg = LbFens.builder().nickName("mlxg").fansSex("boy").build();
        LbFens viper = LbFens.builder().nickName("viper").fansSex("boy").build();

        LbFensGroup lbFensGroup = new LbFensGroupImpl();
        lbFensGroup.joinFensGroup(theShy);
        lbFensGroup.joinFensGroup(faker);
        lbFensGroup.joinFensGroup(rookie);
        lbFensGroup.joinFensGroup(mlxg);
        lbFensGroup.joinFensGroup(viper);

        lbFensGroup.quitFensGroup(rookie);

        System.out.println("---猎豹粉丝--");

        LbFensIterator lbFensIterator = lbFensGroup.getLbFensIterator();
        while (lbFensIterator.hasFens()) {
            LbFens next = lbFensIterator.getNext();
            System.out.println(String.format("猎豹粉丝 昵称：%s",next.getNickName()));
        }
    }
}