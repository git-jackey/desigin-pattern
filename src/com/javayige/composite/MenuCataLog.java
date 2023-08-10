package com.javayige.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public class MenuCataLog extends MenuComponent {
    /**
     * 菜单目录名称
     */
    private String name;
    /**
     * 菜单目录层级
     */
    private Integer level;

    private List<MenuComponent> menuItems = new ArrayList<>();

    public MenuCataLog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }


    @Override
    public String getName(MenuComponent menuComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(MenuComponent component : menuItems) {
            if(this.level != null) {
                for(int i = 0;i <  this.level ; i++) {
                    System.out.print('*');
                }
            }
            component.print();
        }
    }
}