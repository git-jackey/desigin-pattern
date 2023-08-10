package com.javayige.composite;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent index = new MenuItem("首页");

        MenuCataLog lbgrow = new MenuCataLog("猎豹养成",2);
        lbgrow.add(new MenuItem("高阶玩法"));
        lbgrow.add(new MenuItem("啥时候有女粉啊"));

        MenuCataLog corePrint = new MenuCataLog("欢迎猎豹粉丝",1);
        corePrint.add(index);
        corePrint.add(lbgrow);

        corePrint.print();
    }
}