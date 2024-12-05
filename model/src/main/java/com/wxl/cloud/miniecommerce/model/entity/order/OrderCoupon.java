package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.CouponType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：OrderCoupon
 * @description：订单-优惠券
 * @author     ：wxl
 * @date       ：2024/12/05 12:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_order_coupon")
@Schema(name="OrderCoupon",description="订单-优惠券")
public class OrderCoupon extends BaseEntity {

    private static final long serialVersionUID = -54002559990506977L;

    /**
     * 订单id
     */     
    @TableField(value="order_id")
    @Schema(name="orderId",description="订单id")
    private Long orderId;
    /**
     * 优惠券id
     */     
    @TableField(value="coupon_id")
    @Schema(name="couponId",description="优惠券id")
    private Long couponId;
    /**
     * 优惠券名称
     */     
    @TableField(value="coupon_name")
    @Schema(name="couponName",description="优惠券名称")
    private String couponName;
    /**
     * 优惠券类型
     */     
    @TableField(value="coupon_type")
    @Schema(name="couponType",description="优惠券类型")
    private CouponType couponType;
    /**
     * 优惠券商品id
     */     
    @TableField(value="coupon_goods_id")
    @Schema(name="couponGoodsId",description="优惠券商品id")
    private Long couponGoodsId;
    /**
     * 金额
     */     
    @TableField(value="number")
    @Schema(name="number",description="金额")
    private BigDecimal number;


}

