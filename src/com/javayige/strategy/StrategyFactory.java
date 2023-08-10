package com.javayige.strategy;

import com.orangecy.common.enums.LevelEnum;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/10/05
 * @Desc : 策略工厂
 */
public class StrategyFactory {
    /**
     * key为不同的算法  value为策略实现
     * 扩展：这里key是可以具有业务语意的
     * 假设你的type是有分组的概念
     * 比如说加减 属于 LevelEnum.FIRST
     * 比如说乘除 属于 LevelEnum.SECOND
     */
    private static Map<String,AbstractCalculateStrategy> strategyMap = new ConcurrentHashMap<>();

    public static void register(AbstractCalculateStrategy strategy) {
        strategyMap.put(StrategyKeyUtils.generateStrategyKey(strategy.level(),strategy.type()),strategy);
    }

    public static AbstractCalculateStrategy resolve(String type) {
        return strategyMap.get(type);
    }

    /**
     * 按顺序获取某一种等级下的策略集合
     * 如果是加减 先执行加 在执行减
     * @return
     */
    public static List<AbstractCalculateStrategy> getStrategiesByLevel(LevelEnum levelEnum){
        //遍历map 根据key 判断channel
        if(Objects.isNull(levelEnum)) {
            return new ArrayList<>();
        }
        return strategyMap.entrySet().stream()
                .filter(e -> levelEnum.getCode().equals(StrategyKeyUtils.resolveChannelByStrategyKey(e.getKey())))
                .map(Map.Entry::getValue)
                .sorted(Comparator.comparing(e -> e.type().getOrder(),Comparator.nullsLast(Integer::compare)))
                .collect(Collectors.toList());
    }
}