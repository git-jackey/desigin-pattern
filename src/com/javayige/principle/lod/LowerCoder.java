package com.javayige.principle.lod;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :底层码农
 */
public class LowerCoder {

    public void coding(List<Keyboard> keyboards){
        int count =  CollectionUtils.isEmpty(keyboards) ? 0 : keyboards.size();
        System.out.println("天阿,你目前砸烂了键盘总数:" + count);
    }
}