package com.javayige.principle.dip;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :
 */
public class LbFens {
    /**
     * 委托
     */
    private Items items;

    public void setItems(Items items) {
        this.items = items;
    }

    public void buyGoods() {
        items.addIntoShoppingCat();
    }


}