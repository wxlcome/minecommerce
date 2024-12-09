package com.wxl.cloud.miniecommerce.web.admin.vo.system;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.entity.system.Advertisement;
import com.wxl.cloud.miniecommerce.model.enums.system.AdvertisementStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName  ：Advertisement
 * @description：广告
 * @author     ：wxl
 * @date       ：2024/12/08 05:34
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name="AdvertisementAdminVO",description="广告管理VO")
public class AdvertisementAdminVO implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 数据编号
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 商品id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long goodsId;

    /**
     * 商品编号
     */
    private String goodsNo;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 标题
     */
    private String title;

    /**
     * 标题颜色
     */
    private String titleColor;

    /**
     * 描述
     */
    private String description;

    /**
     * 简介颜色
     */
    private String descriptionColor;

    /**
     * 概念图
     */
    private String ideaImg;

    /**
     * 顺序
     */
    private Integer adIndex;

    /**
     * 状态（0-未上线，1-已上线）
     */
    private AdvertisementStatus status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

}

