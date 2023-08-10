package com.javayige.iterator;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : orangeCy.奕
 * @Product : 猎豹养成产品源码
 * @Time : 2021/12/3
 * @Desc : 猎豹粉丝
 */
@Data
@Builder
@Getter
@Setter
public class LbFens {

    /**
     * 粉丝昵称
     */
    private String nickName;

    /**
     * 粉丝性别
     */
    private String fansSex;

}