package com.javayige.iterator;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc : 猎豹粉丝迭代器
 */
public interface LbFensIterator {
    /**
     * 获取下一个幸运粉丝
     * @return
     */
    LbFens getNext();

    /**
     * 是否还有粉丝
     * @return
     */
    boolean hasFens();
}