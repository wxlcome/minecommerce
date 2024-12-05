package com.wxl.cloud.miniecommerce.model.entity.account;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.account.AccountPaymethodStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：AccountPaymethod
 * @description：账户-支付方式
 * @author     ：wxl
 * @date       ：2024/12/05 11:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_account_paymethod")
@Schema(name="AccountPaymethod",description="账户-支付方式")
public class AccountPaymethod extends BaseEntity {

    private static final long serialVersionUID = 805646329633537650L;

    /**
     * 账户id
     */     
    @TableField(value="account_id")
    @Schema(name="accountId",description="账户id")
    private Long accountId;
    /**
     * 支付方式id
     */     
    @TableField(value="paymethod_id")
    @Schema(name="paymethodId",description="支付方式id")
    private Integer paymethodId;
    /**
     * 支付方式名称
     */     
    @TableField(value="paymethod_name")
    @Schema(name="paymethodName",description="支付方式名称")
    private String paymethodName;
    /**
     * 支付方式code
     */     
    @TableField(value="paymethod_code")
    @Schema(name="paymethodCode",description="支付方式code")
    private String paymethodCode;
    /**
     * 支付方式图标
     */     
    @TableField(value="paymethod_icon")
    @Schema(name="paymethodIcon",description="支付方式图标")
    private String paymethodIcon;

    /**
     * 状态（0-已禁用，1-已启用）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-已禁用，1-已启用）")
    private AccountPaymethodStatus status;


}

