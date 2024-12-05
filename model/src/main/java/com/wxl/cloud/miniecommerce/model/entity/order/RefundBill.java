package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.order.RefundStatus;
import com.wxl.cloud.miniecommerce.model.enums.order.RefundType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：RefundBill
 * @description：退款单
 * @author     ：wxl
 * @date       ：2024/12/05 12:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_refund_bill")
@Schema(name="RefundBill",description="退款单")
public class RefundBill extends BaseEntity {

    private static final long serialVersionUID = -20083157462638342L;

    /**
     * 售后单id
     */     
    @TableField(value="post_sale_bill_id")
    @Schema(name="postSaleBillId",description="售后单id")
    private Long postSaleBillId;
    /**
     * 退款类型（1-退货退款（已收货）、2-仅退款（未收到货））
     */     
    @TableField(value="refund_type")
    @Schema(name="refundType",description="退款类型（1-退货退款（已收货）、2-仅退款（未收到货））")
    private RefundType refundType;
    /**
     * 状态（0-已取消、1-拒绝退款、2-确认退款、3-买家未发货、4-退货物流运输中、5-卖家确认收货、6-退款成功）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-已取消、1-拒绝退款、2-确认退款、3-买家未发货、4-退货物流运输中、5-卖家确认收货、6-退款成功）")
    private RefundStatus status;

}

