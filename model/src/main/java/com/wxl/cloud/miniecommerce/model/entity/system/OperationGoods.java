package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName  ：OperationGoods
 * @description：活动商品
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_operation_goods")
@Schema(name="OperationGoods",description="活动商品")
public class OperationGoods extends BaseEntity {

    private static final long serialVersionUID = 890493430414835258L;
    /**
     * 数据编号
     */     
    @TableId("id")
    @Schema(name="id",description="数据编号")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * 活动id
     */     
    @TableField(value="operation_id")
    @Schema(name="operationId",description="活动id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long operationId;
    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long goodsId;
    /**
     * 商品名称
     */     
    @TableField(value="goods_name")
    @Schema(name="goodsName",description="商品名称")
    private String goodsName;
    /**
     * 最低单价
     */     
    @TableField(value="low_price")
    @Schema(name="lowPrice",description="最低单价")
    private BigDecimal lowPrice;


}

