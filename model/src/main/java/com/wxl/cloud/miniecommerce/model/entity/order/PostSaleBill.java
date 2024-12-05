package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.order.PostSaleStatus;
import com.wxl.cloud.miniecommerce.model.enums.order.PostSaleType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：PostSaleBill
 * @description：售后单
 * @author     ：wxl
 * @date       ：2024/12/05 12:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_post_sale_bill")
@Schema(name="PostSaleBill",description="售后单")
public class PostSaleBill extends BaseEntity {

    private static final long serialVersionUID = 267762529735164695L;

    /**
     * 订单id
     */     
    @TableField(value="order_id")
    @Schema(name="orderId",description="订单id")
    private Long orderId;
    /**
     * 售后类型(1-退款、2-换货)
     */     
    @TableField(value="post_sale_type")
    @Schema(name="postSaleType",description="售后类型(1-退款、2-换货)")
    private PostSaleType postSaleType;
    /**
     * 申请售后原因
     */     
    @TableField(value="apply_reason")
    @Schema(name="applyReason",description="申请售后原因")
    private String applyReason;
    /**
     * 拒绝售后原因
     */     
    @TableField(value="reject_reason")
    @Schema(name="rejectReason",description="拒绝售后原因")
    private String rejectReason;
    /**
     * 状态（0-已取消、1-已完成）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-已取消、1-已完成）")
    private PostSaleStatus status;


}

