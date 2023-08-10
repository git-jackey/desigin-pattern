package com.javayige.composite;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public class MenuItem extends MenuComponent {
    /**
     * 菜单项名称
     */
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(String.format("%s",name));
    }
}