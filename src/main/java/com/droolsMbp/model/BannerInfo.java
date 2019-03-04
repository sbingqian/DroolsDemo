package com.droolsMbp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Data
public class BannerInfo implements Serializable {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 图片编号
     */
    private String fileId;

    /**
     * url
     */
    private String url;

    /**
     * 业务类型 1-下拉提示语 2-banner 3-子应用icon 4-橙购秒杀活动
     */
    private String busType;

    /**
     * 类型 1-理财 2-支付 3-借款 4-保险
     */
    private String type;

    /**
     * 内容
     */
    private String content;

    /**
     * 状态 0-下线 1-待上线 2-上线 3-待下线 4-维护 5-屏蔽
     */
    private String status;

    /**
     * 最后更新人
     */
    private String  updatedBy;

    /**
     * 最后更新时间
     */
    private Date updatedAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 展示优先级
     */
    private String showSeq;
    /**
     * 标志
     */
    private String sign;

    /**
     * 金融标识
     */
    private String financeSign;

    /**
     * 开始时间
     */
    private Date beginDate;

    /**
     * 结束时间
     */
    private Date endDate;

}
