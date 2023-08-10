package com.javayige.strategy;

import com.orangecy.common.enums.LevelEnum;
import com.orangecy.common.enums.OperateEnum;
import com.orangecy.common.exception.OrangeCyException;
import org.springframework.util.StringUtils;

/**
 * @Author : orangeCy.奕
 * @Time : 2021/10/6
 * @desc : 猎豹养成产品源码
 */
public class StrategyKeyUtils {

    public static String generateStrategyKey(LevelEnum levelEnum, OperateEnum operateEnum) {
        if(null == levelEnum || null == operateEnum) {
            throw new OrangeCyException("params null");
        }
        return levelEnum.getCode() + "_" + operateEnum.getType();
    }

    public static String resolveChannelByStrategyKey(String strategyKey) {
        if(StringUtils.isEmpty(strategyKey)) {
            return null;
        }
        return StringUtils.split(strategyKey,"_")[0];
    }
}