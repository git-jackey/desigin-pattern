package com.javayige.principle.lsp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :
 */
public class LbGrowFens implements LbFens {
    private Integer fensNo;

    private String fensName;

    private Double price;

    public LbGrowFens(Integer fensNo,
                      String fensName,
                      Double price) {
        this.fensNo = fensNo;
        this.fensName = fensName;
        this.price = price;
    }


    @Override
    public Integer getFensNo() {
        return this.fensNo;
    }

    @Override
    public String getFensName() {
        return this.fensName;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}