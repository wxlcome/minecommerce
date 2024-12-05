package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：GoodsSpecGroupData
 * @description：商品规格组数据
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods_spec_group_data")
@Schema(name="GoodsSpecGroupData",description="商品规格组数据")
public class GoodsSpecGroupData extends BaseEntity {

    private static final long serialVersionUID = 923578463120268848L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 商品规格组id
     */     
    @TableField(value="goods_spec_group_id")
    @Schema(name="goodsSpecGroupId",description="商品规格组id")
    private Long goodsSpecGroupId;
    /**
     * 商品规格组名称
     */     
    @TableField(value="goods_spec_group_name")
    @Schema(name="goodsSpecGroupName",description="商品规格组名称")
    private String goodsSpecGroupName;
    /**
     * 规格名称
     */     
    @TableField(value="spec_name")
    @Schema(name="specName",description="规格名称")
    private String specName;
    /**
     * 商品规格值id
     */     
    @TableField(value="goods_spec_value_id")
    @Schema(name="goodsSpecValueId",description="商品规格值id")
    private Long goodsSpecValueId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;


}

