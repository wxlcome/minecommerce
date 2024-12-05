package com.wxl.cloud.miniecommerce.model.entity.account;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：AccountCart
 * @description：账户-购物车
 * @author     ：wxl
 * @date       ：2024/12/05 11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_account_cart")
@Schema(name="AccountCart",description="账户-购物车")
public class AccountCart extends BaseEntity {

    private static final long serialVersionUID = 655120032936964702L;

    /**
     * 账户id
     */     
    @TableField(value="account_id")
    @Schema(name="accountId",description="账户id")
    private Long accountId;
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
     * 规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="规格组id")
    private Long specGroupId;
    /**
     * 单价
     */     
    @TableField(value="price")
    @Schema(name="price",description="单价")
    private BigDecimal price;
    /**
     * 数量
     */     
    @TableField(value="amount")
    @Schema(name="amount",description="数量")
    private Integer amount;


}

