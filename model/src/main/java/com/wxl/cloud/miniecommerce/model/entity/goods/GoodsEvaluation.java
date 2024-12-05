package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：GoodsEvaluation
 * @description：商品-评价
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_evaluation")
@Schema(name="GoodsEvaluation",description="商品-评价")
public class GoodsEvaluation extends BaseEntity {

    private static final long serialVersionUID = 666086195860927274L;

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
     * 规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="规格组id")
    private Long specGroupId;
    /**
     * 评分
     */     
    @TableField(value="star")
    @Schema(name="star",description="评分")
    private Integer star;
    /**
     * 文本内容
     */     
    @TableField(value="content")
    @Schema(name="content",description="文本内容")
    private String content;


}

