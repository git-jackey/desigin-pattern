package com.javayige.singleton.v10;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2022/1/15
 * @Desc :猎豹单例-容器单例
 */
public class LbSingleton {

    private static Map<String,Object> map = Maps.newHashMap();

    private LbSingleton(){}

    public static void put(String key,Object instance) {
        if(StringUtils.isNotBlank(key) && null != instance) {
            if(!map.containsKey(key)) {
                map.put(key,instance);
            }
        }
    }

    public static Object get(String key) {
        return map.get(key);
    }
}