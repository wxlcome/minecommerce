package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：GoodsParamValue
 * @description：商品参数值
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_param_value")
@Schema(name="GoodsParamValue",description="商品参数值")
public class GoodsParamValue extends BaseEntity {

    private static final long serialVersionUID = 202396921156005858L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 参数名称
     */     
    @TableField(value="param_name")
    @Schema(name="paramName",description="参数名称")
    private String paramName;
    /**
     * 参数值id
     */     
    @TableField(value="param_value_id")
    @Schema(name="paramValueId",description="参数值id")
    private Long paramValueId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;


}

