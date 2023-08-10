package com.javayige.principle.ocp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc :猎豹粉丝
 */
public class LbFens implements Person {

    private Boolean singleDog;

    private Integer age;

    public LbFens(Boolean singleDog, Integer age) {
        this.singleDog = singleDog;
        this.age = age;
    }

    @Override
    public Boolean singleDog() {
        return this.singleDog;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}