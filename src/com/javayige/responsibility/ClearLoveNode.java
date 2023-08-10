package com.javayige.responsibility;

import java.util.Objects;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/7
 * @Desc :EDG教练 厂长节点
 */
public class ClearLoveNode extends ChainNoder {
    @Override
    public boolean handlerRequest(int level) {
        if(level <= 5) {
            System.out.println("等级太低了，我不处理，交给小弟");
            return true;
        }
        ChainNoder next = this.getNext();
        if(Objects.isNull(next)) {
            //没小弟 edg凉了？
            return false;
        }
        //有小弟
        return getNext().handlerRequest(level);
    }
}