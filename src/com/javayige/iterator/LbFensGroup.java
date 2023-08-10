package com.javayige.iterator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc :
 */
public interface LbFensGroup {

    /**
     * 粉丝加入
     */
    void joinFensGroup(LbFens lbFens);

    /**
     * 粉丝退出
     */
    void quitFensGroup(LbFens lbFens);

    /**
     * 获取猎豹粉丝迭代器
     * @return
     */
    LbFensIterator getLbFensIterator();

}