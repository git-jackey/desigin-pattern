package com.javayige.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public class LbFensGroupImpl implements LbFensGroup {

    private List<LbFens> lbFensList = Lists.newArrayList();

    @Override
    public void joinFensGroup(LbFens lbFens) {
        lbFensList.add(lbFens);
    }

    @Override
    public void quitFensGroup(LbFens lbFens) {
        lbFensList.remove(lbFens);
    }

    @Override
    public LbFensIterator getLbFensIterator() {
        return new LbFensIteratorImpl(lbFensList);
    }
}