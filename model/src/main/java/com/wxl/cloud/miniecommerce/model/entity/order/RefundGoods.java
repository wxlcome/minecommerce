package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：RefundGoods
 * @description：退款货物
 * @author     ：wxl
 * @date       ：2024/12/05 12:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_refund_goods")
@Schema(name="RefundGoods",description="退款货物")
public class RefundGoods extends BaseEntity {

    private static final long serialVersionUID = 802965480909087833L;

    /**
     * 退款单id
     */     
    @TableField(value="refund_bill_id")
    @Schema(name="refundBillId",description="退款单id")
    private Long refundBillId;
    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
     
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="${column.comment}")
    private String goodsName;
    /**
     * 商品规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="商品规格组id")
    private Long specGroupId;
    /**
     * 数量
     */     
    @TableField(value="amount")
    @Schema(name="amount",description="数量")
    private Integer amount;
    /**
     * 单价
     */     
    @TableField(value="price")
    @Schema(name="price",description="单价")
    private BigDecimal price;


}

