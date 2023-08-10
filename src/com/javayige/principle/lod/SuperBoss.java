package com.javayige.principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :老板类
 */
public class SuperBoss {

    public void hireKeyBoardCountCheck(LowerCoder lowerCoder) {
        //mock 键盘
        List<Keyboard> keyboards = new ArrayList<Keyboard>(){{
           add(new Keyboard());
           add(new Keyboard());
        }};
        lowerCoder.coding(keyboards);
    }
}