package com.wxl.cloud.miniecommerce.system.vo.admin;

import java.io.Serializable;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.enums.system.AdvertisementStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * @ClassName  ：Advertisement
 * @description：广告管理vo
 * @author     ：wxl
 * @date       ：2024/12/08 05:34
 */
@Data
@Schema(name="AdvertisementAdminVO",description="广告管理vo")
public class AdvertisementAdminVO implements Serializable {

    private static final long serialVersionUID = -44816025154531714L;

    /**
     * 数据行id
     */
    @Schema(name="id",description="数据行id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 商品id
     */
    @Schema(name="goodsId",description="商品id")
    @JsonSerialize(using = ToStringSerializer.class)

    private Long goodsId;
    /**
     * 商品编号
     */
    @Schema(name="goodsNo",description="商品编号")
    private String goodsNo;
    /**
     * 商品名称
     */
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;
    /**
     * 标题
     */
    @Schema(name="title",description="标题")
    private String title;
    /**
     * 标题颜色
     */
    @Schema(name="titleColor",description="标题颜色")
    private String titleColor;
    /**
     * 描述
     */
    @Schema(name="description",description="描述")
    private String description;
    /**
     * 简介颜色
     */
    @Schema(name="descriptionColor",description="简介颜色")
    private String descriptionColor;
    /**
     * 概念图
     */
    @Schema(name="ideaImg",description="概念图")
    private String ideaImg;
    /**
     * 顺序
     */
    @Schema(name="adIndex",description="顺序")
    private Integer adIndex;
    /**
     * 状态（0-未上线，1-已上线）
     */
    @Schema(name="status",description="状态（0-未上线，1-已上线）")
    private AdvertisementStatus status;
    /**
     * 创建时间
     */
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

}

