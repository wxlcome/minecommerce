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
 * @ClassName  ：AccountFavor
 * @description：账户-收藏
 * @author     ：wxl
 * @date       ：2024/12/05 11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_account_favor")
@Schema(name="AccountFavor",description="账户-收藏")
public class AccountFavor extends BaseEntity {

    private static final long serialVersionUID = 468975871906462279L;

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
     * 最低单价
     */     
    @TableField(value="low_price")
    @Schema(name="lowPrice",description="最低单价")
    private BigDecimal lowPrice;


}

