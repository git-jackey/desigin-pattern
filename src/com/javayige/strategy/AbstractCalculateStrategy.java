package com.javayige.strategy;

import com.orangecy.common.enums.LevelEnum;
import com.orangecy.common.enums.OperateEnum;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author : orangeCy
 * @Time : 2021/10/5
 * @desc : 猎豹养成产品源码
 * 策略抽象
 * <pre>
 * 不同算法之间的组合  对应的业务流程一致
 * 其中calculate 方法 承担 业务的计算
 * 其中type 方法 承担 不同的算法 -- 1 多种  通过适配的方式去解决此类问题
 *
 * 一般的实现 就是 工厂 + 抽象接口 实现 策略模式
 * 这里的工厂可以使用Function<K,V> 高阶函数替换
 * </pre>
 */
public abstract class AbstractCalculateStrategy implements InitializingBean {
    /**
     * 计算
     * @param a
     * @param b
     * @return
     */
    public abstract Integer calculate(Integer a,Integer b);

    /**
     * 等级
     * @return
     */
    public abstract LevelEnum level();

    /**
     * 类型
     * @return
     * 一般情况下这里采用枚举定义 @see OperateEnum
     */
    public abstract OperateEnum type();

    @Override
    public void afterPropertiesSet() {
        //注入子例
        StrategyFactory.register(this);
    }
}