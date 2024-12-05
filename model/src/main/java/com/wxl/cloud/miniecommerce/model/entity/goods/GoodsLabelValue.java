package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：GoodsLabelValue
 * @description：商品标签值
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_label_value")
@Schema(name="GoodsLabelValue",description="商品标签值")
public class GoodsLabelValue extends BaseEntity {

    private static final long serialVersionUID = -75329661571054071L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 标签名
     */     
    @TableField(value="label_name")
    @Schema(name="labelName",description="标签名")
    private String labelName;
    /**
     * 标签值id
     */     
    @TableField(value="label_value_id")
    @Schema(name="labelValueId",description="标签值id")
    private Long labelValueId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;



}

