package com.wxl.cloud.miniecommerce.model.entity.storage;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Storage
 * @description：库存
 * @author     ：wxl
 * @date       ：2024/12/05 13:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_storage")
@Schema(name="Storage",description="库存")
public class Storage extends BaseEntity {

    private static final long serialVersionUID = -82611389903831591L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;

    /**
     * 商品规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="商品规格组id")
    private Long specGroupId;

    /**
     * 销售量
     */     
    @TableField(value="sale_amount")
    @Schema(name="saleAmount",description="销售量")
    private Integer saleAmount;
    /**
     * 退货量
     */     
    @TableField(value="return_amount")
    @Schema(name="returnAmount",description="退货量")
    private Integer returnAmount;

    /**
     * 库存量
     */     
    @TableField(value="stock_amount")
    @Schema(name="stockAmount",description="库存量")
    private Integer stockAmount;


}

