package com.javayige.composite;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :菜单组件类
 */
public abstract class MenuComponent {

    public abstract String getName(MenuComponent menuComponent);

    public abstract void print();
}