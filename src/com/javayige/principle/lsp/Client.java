package com.javayige.principle.lsp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :设计模式原则之LSP(Liskov-Substitution-principle)
 * <p>一个class/module对另一个class/module的依赖应该建立在最小的接口上，依赖倒置，高层模块不应依赖低层模块，细节不应该依赖抽象</p>
 */
public class Client {
    public static void main(String[] args) {
        LbFens lbFens = new FensDiscount(1,"我爱平底锅哈",10d);

        FensDiscount fensDiscount = (FensDiscount) lbFens;

        System.out.println(String.format(
                "粉丝编号:%s,粉丝姓名:%s,粉丝余额:%s,折后余：%s",
                fensDiscount.getFensNo(),
                fensDiscount.getFensName(),
                fensDiscount.getPrice(),
                fensDiscount.getDiscountPrice()
        ));
    }
}