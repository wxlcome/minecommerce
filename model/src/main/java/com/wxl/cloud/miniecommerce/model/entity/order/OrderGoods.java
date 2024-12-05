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
 * @ClassName  ：OrderGoods
 * @description：订单-商品
 * @author     ：wxl
 * @date       ：2024/12/05 12:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_order_goods")
@Schema(name="OrderGoods",description="订单-商品")
public class OrderGoods extends BaseEntity {

    private static final long serialVersionUID = 295360922681297766L;

    /**
     * 订单id
     */     
    @TableField(value="order_id")
    @Schema(name="orderId",description="订单id")
    private Long orderId;
    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 商品名称
     */     
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;
    /**
     * 规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="规格组id")
    private Long specGroupId;
    /**
     * 价格
     */     
    @TableField(value="price")
    @Schema(name="price",description="价格")
    private BigDecimal price;
    /**
     * 数量
     */     
    @TableField(value="amount")
    @Schema(name="amount",description="数量")
    private Integer amount;


}

