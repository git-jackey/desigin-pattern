package com.javayige.processor;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/10/29
 * @Desc :
 */
public class ItemPublishServiceImpl implements ItemPublishService {
    @Resource
    private List<ValidateBizService> validateBizServices;

    @Override
    public boolean canPublish() {
        for(ValidateBizService bizService : validateBizServices) {
            if(!bizService.pass()) {
                System.out.println(bizService.handle() + "未pass");
                return false;
            }
        }
        return true;
    }
}