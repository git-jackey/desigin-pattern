package com.javayige.principle.ocp;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/11/21
 * @Desc : 设计模式原则之OCP（open-close-principle）
 */
public class Client {

    public static void main(String[] args) {
        //定义一个粉丝 惊孟同学
        Person person = new LbFens(Boolean.TRUE,18);

        System.out.println(String.format("单身：%s,年龄：%s", person.singleDog(), person.getAge()));

        //balabala  搞错了？？ 惊孟同学有对象啦 怎么办
        //第一反应 修改属性呗！发现person对象只有读方法 无法修改！
        /**
         * 这时候就是对person的修改做了关闭 - 多态（父类的引用指向子类的实例）
         */
    }

}