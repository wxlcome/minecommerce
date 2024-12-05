package com.wxl.cloud.miniecommerce.model.entity.account;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.account.AccountStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName  ：Account
 * @description：账户
 * @author     ：wxl
 * @date       ：2024/12/05 11:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_account")
@Schema(name="Account",description="账户")
public class Account extends BaseEntity {

    private static final long serialVersionUID = 292738501211500495L;

    /**
     * 手机号
     */     
    @TableField(value="phone")
    @Schema(name="phone",description="手机号")
    private String phone;
    /**
     * 邮箱
     */     
    @TableField(value="email")
    @Schema(name="email",description="邮箱")
    private String email;
    /**
     * 密码
     */     
    @TableField(value="password")
    @Schema(name="password",description="密码")
    private String password;
    /**
     * 用户名
     */     
    @TableField(value="username")
    @Schema(name="username",description="用户名")
    private String username;
    /**
     * 头像
     */     
    @TableField(value="avatar")
    @Schema(name="avatar",description="头像")
    private String avatar;
    /**
     * 签名
     */     
    @TableField(value="sign")
    @Schema(name="sign",description="签名")
    private String sign;
    /**
     * 余额
     */     
    @TableField(value="balance")
    @Schema(name="balance",description="余额")
    private BigDecimal balance;

    /**
     * 账号状态（0-封禁、1-正常）
     */     
    @TableField(value="status")
    @Schema(name="status",description="账号状态（0-封禁、1-正常）")
    private AccountStatus status;


}

