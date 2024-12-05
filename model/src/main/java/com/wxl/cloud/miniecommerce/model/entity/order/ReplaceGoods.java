package com.wxl.cloud.miniecommerce.model.entity.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ReplaceGoods
 * @description：换货
 * @author     ：wxl
 * @date       ：2024/12/05 12:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_replace_goods")
@Schema(name="ReplaceGoods",description="换货")
public class ReplaceGoods extends BaseEntity {

    private static final long serialVersionUID = 620725911223578146L;

    /**
     * 换货单id
     */     
    @TableField(value="replace_goods_bill_id")
    @Schema(name="replaceGoodsBillId",description="换货单id")
    private Long replaceGoodsBillId;
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
     * 旧规格组id
     */     
    @TableField(value="old_spec_group_id")
    @Schema(name="oldSpecGroupId",description="旧规格组id")
    private Long oldSpecGroupId;
    /**
     * 新规格组id
     */     
    @TableField(value="new_spec_group_id")
    @Schema(name="newSpecGroupId",description="新规格组id")
    private Long newSpecGroupId;
    /**
     * 数量
     */     
    @TableField(value="amount")
    @Schema(name="amount",description="数量")
    private Integer amount;


}

