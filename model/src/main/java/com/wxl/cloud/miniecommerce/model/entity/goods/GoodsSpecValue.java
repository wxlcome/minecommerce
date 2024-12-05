package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：GoodsSpecValue
 * @description：商品规格值
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_spec_value")
@Schema(name="GoodsSpecValue",description="商品规格值")
public class GoodsSpecValue extends BaseEntity {

    private static final long serialVersionUID = -85418803373617202L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 规格名称
     */     
    @TableField(value="spec_name")
    @Schema(name="specName",description="规格名称")
    private String specName;
    /**
     * 规格值id
     */     
    @TableField(value="spec_value_id")
    @Schema(name="specValueId",description="规格值id")
    private Long specValueId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;
     


}

