package com.wxl.cloud.miniecommerce.system.vo.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.enums.system.CouponStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.CouponType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * @ClassName  ：CouponAdminVO
 * @description：优惠券管理VO
 * @author     ：wxl
 * @date       ：2024/12/09 13:10
 */
@Data
@Schema(name="CouponAdminVO",description="优惠券管理VO")
public class CouponAdminVO implements Serializable {

    private static final long serialVersionUID = 166723804409427761L;

    /**
     * 数据行id
     */
    @Schema(name="id",description="数据行id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long goodsId;

    /**
     * 商品编号
     */
    @TableField(value="goods_no")
    @Schema(name="goodsNo",description="商品编号")
    private String goodsNo;

    /**
     * 商品名称
     */
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;

    /**
     * 名称
     */     
    @TableField(value="coupon_name")
    @Schema(name="couponName",description="名称")
    private String couponName;

    /**
     * 优惠券类型（1-全场券、2-单品券）
     */     
    @TableField(value="coupon_type")
    @Schema(name="couponType",description="优惠券类型（1-全场券、2-单品券）")
    private CouponType couponType;

    /**
     * 金额
     */     
    @TableField(value="number")
    @Schema(name="number",description="金额")
    private BigDecimal number;

    /**
     * 状态（0-禁用、1-启用）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-禁用、1-启用）")
    private CouponStatus status;

    /**
     * 创建时间
     */
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;


}

