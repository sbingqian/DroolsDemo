package com.droolsMbp.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BigDataUserTag implements Serializable {

    /**
     * 本异网标识  1-本网 2-异网
     */
    private String netWorkType;

    /**
     * 性别 1-男 2-女
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;

    /**
     * 省份
     */
    private String regionArea;

    /**
     * 市区
     */
    private String regionCity;

    /**
     * 查询结果成功标识
     */
    private boolean isQuerySucceed;

    /**
     * 理财甜蜜值
     */
    private String financial;

    /**
     * 用户类别 1:红包用户  2:非红包用户
     */
    private String userType;
}
