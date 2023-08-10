package com.javayige.command;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/11
 * @Desc :
 */
public class LbFens {

    private String fensName;

    public LbFens(String fensName) {
        this.fensName = fensName;
    }

    /**
     * 猎豹粉丝 - 对象
     * 聊天 - 行为
     */
    public void chattingInGroup() {
        System.out.println(this.fensName + "猎豹粉丝群-未来可期 聊天");
    }

    /**
     * 猎豹粉丝 - 对象
     * 端茶 - 行为
     */
    public void transmitTea(){
        System.out.println("LOOK! " + this.fensName + "在给群主端茶");
    }

}