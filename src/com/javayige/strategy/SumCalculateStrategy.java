package com.javayige.strategy;

import com.orangecy.common.enums.LevelEnum;
import com.orangecy.common.enums.OperateEnum;
import org.springframework.stereotype.Component;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/10/19
 * @Desc :
 */
@Component
public class SumCalculateStrategy extends AbstractCalculateStrategy {
    @Override
    public Integer calculate(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public LevelEnum level() {
        return LevelEnum.FIRST;
    }

    @Override
    public OperateEnum type() {
        return OperateEnum.ADD;
    }
}