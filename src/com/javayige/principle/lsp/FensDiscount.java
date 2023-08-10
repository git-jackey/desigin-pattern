package com.javayige.principle.lsp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :粉丝折扣
 */
public class FensDiscount extends LbGrowFens{

    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }


    public FensDiscount(Integer fensNo, String fensName, Double price) {
        super(fensNo, fensName, price);
    }
}