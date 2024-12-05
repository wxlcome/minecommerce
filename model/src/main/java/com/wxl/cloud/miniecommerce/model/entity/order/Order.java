package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.order.OrderStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName  ：Order
 * @description：订单
 * @author     ：wxl
 * @date       ：2024/12/05 12:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_order")
@Schema(name="Order",description="订单")
public class Order extends BaseEntity {

    private static final long serialVersionUID = 986779861251598888L;

    /**
     * 账户id
     */     
    @TableField(value="account_id")
    @Schema(name="accountId",description="账户id")
    private Long accountId;
    /**
     * 订单编号
     */     
    @TableField(value="order_no")
    @Schema(name="orderNo",description="订单编号")
    private String orderNo;
    /**
     * 运费
     */     
    @TableField(value="delivery")
    @Schema(name="delivery",description="运费")
    private BigDecimal delivery;
    /**
     * 减价
     */     
    @TableField(value="reduction")
    @Schema(name="reduction",description="减价")
    private BigDecimal reduction;
    /**
     * 小计
     */     
    @TableField(value="subtotal")
    @Schema(name="subtotal",description="小计")
    private BigDecimal subtotal;
    /**
     * 实际应付
     */     
    @TableField(value="total")
    @Schema(name="total",description="实际应付")
    private BigDecimal total;
    /**
     * 支付方式id
     */     
    @TableField(value="paymethod_id")
    @Schema(name="paymethodId",description="支付方式id")
    private Long paymethodId;
    /**
     * 支付方式名称
     */     
    @TableField(value="paymethod_name")
    @Schema(name="paymethodName",description="支付方式名称")
    private String paymethodName;
    /**
     * 支付时间
     */     
    @TableField(value="pay_time")
    @Schema(name="payTime",description="支付时间")
    private Date payTime;
    /**
     * 订单状态（0-已取消、1-已确认、2-未付款、3-未发货、4-发货物流运输中、5-确认收货、6-已完成）
     */     
    @TableField(value="status")
    @Schema(name="status",description="订单状态（0-已取消、1-已确认、2-未付款、3-未发货、4-发货物流运输中、5-确认收货、6-已完成）")
    private OrderStatus status;


}

