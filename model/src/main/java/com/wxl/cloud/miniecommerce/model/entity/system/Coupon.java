package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.CouponStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.CouponType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：Coupon
 * @description：优惠券
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_coupon")
@Schema(name="Coupon",description="优惠券")
public class Coupon extends BaseEntity {

    private static final long serialVersionUID = 443491108108385154L;

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
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
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


}

