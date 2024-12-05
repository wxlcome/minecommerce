package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.goods.GoodsStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：Goods
 * @description：商品
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_goods")
@Schema(name="Goods",description="商品")
public class Goods extends BaseEntity {

    private static final long serialVersionUID = 358619939672836465L;

    /**
     * 商品名称
     */     
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;
    /**
     * 描述
     */     
    @TableField(value="description")
    @Schema(name="description",description="描述")
    private String description;
    /**
     * 商品编码
     */     
    @TableField(value="goods_code")
    @Schema(name="goodsCode",description="商品编码")
    private String goodsCode;
    /**
     * 品牌id
     */     
    @TableField(value="brand_id")
    @Schema(name="brandId",description="品牌id")
    private Integer brandId;
    /**
     * 品牌中文名称
     */     
    @TableField(value="brand_cn_name")
    @Schema(name="brandCnName",description="品牌中文名称")
    private String brandCnName;
    /**
     * 品牌英文名称
     */     
    @TableField(value="brand_en_name")
    @Schema(name="brandEnName",description="品牌英文名称")
    private String brandEnName;
    /**
     * 所属分类id
     */     
    @TableField(value="category_id")
    @Schema(name="categoryId",description="所属分类id")
    private Long categoryId;
    /**
     * 分类名称
     */     
    @TableField(value="category_name")
    @Schema(name="categoryName",description="分类名称")
    private String categoryName;
    /**
     * 折扣（百分比）
     */     
    @TableField(value="discount")
    @Schema(name="discount",description="折扣（百分比）")
    private BigDecimal discount;
    /**
     * 单位
     */     
    @TableField(value="unit")
    @Schema(name="unit",description="单位")
    private String unit;
    /**
     * 商品状态（0-下架、1-上架）
     */     
    @TableField(value="status")
    @Schema(name="status",description="商品状态（0-下架、1-上架）")
    private GoodsStatus status;


}

