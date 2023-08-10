package com.javayige.iterator;

import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc : 猎豹迭代器实现
 */
public class LbFensIteratorImpl implements LbFensIterator {

    private List<LbFens> lbFensList;

    public LbFensIteratorImpl(List<LbFens> lbFensList) {
        this.lbFensList = lbFensList;
    }

    /**
     * 迭代索引
     */
    private int index;

    @Override
    public LbFens getNext() {
        System.out.println("cur index:" + index);
        LbFens lbFens = lbFensList.get(index);
        index ++ ;
        return lbFens;
    }

    @Override
    public boolean hasFens() {
        return index < lbFensList.size();
    }
}