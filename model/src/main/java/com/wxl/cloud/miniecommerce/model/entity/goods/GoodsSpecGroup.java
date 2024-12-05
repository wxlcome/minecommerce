package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：GoodsSpecGroup
 * @description：商品规格组
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_spec_group")
@Schema(name="GoodsSpecGroup",description="商品规格组")
public class GoodsSpecGroup extends BaseEntity {

    private static final long serialVersionUID = -68578797930361376L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 规格组名称
     */     
    @TableField(value="name")
    @Schema(name="name",description="规格组名称")
    private String name;
    /**
     * 单价
     */     
    @TableField(value="price")
    @Schema(name="price",description="单价")
    private BigDecimal price;
    /**
     * 成本价
     */     
    @TableField(value="cost")
    @Schema(name="cost",description="成本价")
    private BigDecimal cost;
    /**
     * 运费
     */     
    @TableField(value="delivery")
    @Schema(name="delivery",description="运费")
    private BigDecimal delivery;


}

