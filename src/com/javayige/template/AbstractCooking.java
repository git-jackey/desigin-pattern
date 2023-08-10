package com.javayige.template;


/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/26
 * @Desc :抽象烹饪 - 钩子函数
 */
public abstract class AbstractCooking {
    /**
     * 蛋炒饭官方教程
     * 每个步骤之间是隔离的
     */
    public final void cooking(){
        //step1 买菜
        this.buyVegetables();
        //step2 倒油
        this.pourEdibleOil();
        //step3 加鸡蛋 加饭
        this.addEggAndRice();
        //step4 翻炒
        this.stirFry();
        //这里根据个人口味是否有忌口 香菜 香葱
        if(needChoppedLittleOnion()) {
            this.addChoppedLitteOnion();
        }
        //step5 洗锅
        this.washPot();
    }

    /**
     * 这个方法不需要进行实现
     * 钩子方法/钩子函数 交给继承此抽象类的子类实现
     * @return
     */
    protected abstract boolean needChoppedLittleOnion();

    protected void addChoppedLitteOnion(){
        // common logic
        System.out.println("加葱===");
    }

    protected void washPot(){
        // common logic
        System.out.println("洗锅===");
    }

    protected  void stirFry(){
        // common logic
        System.out.println("翻炒===");
    }

    protected void pourEdibleOil(){
        // common logic
        System.out.println("倒入食用油===");
    }

    protected void addEggAndRice(){
        // common logic
        System.out.println("加鸡蛋加米饭===");
    }

    protected  void buyVegetables(){
        // common logic
        System.out.println("买菜===");
    }
}