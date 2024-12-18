package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.PaymentType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName  ：Paymethod
 * @description：支付方式
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_paymethod")
@Schema(name="Paymethod",description="支付方式")
public class Paymethod implements Serializable {

    private static final long serialVersionUID = -53447569520311879L;

    /**
     * 数据行id
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    @Schema(name="id",description="数据行id")
    private Long id;
    /**
     * 名称
     */     
    @TableField(value="paymethod_name")
    @Schema(name="paymethodName",description="名称")
    private String paymethodName;
    /**
     * 代码
     */     
    @TableField(value="code")
    @Schema(name="code",description="代码")
    private String code;
    /**
     * 图标
     */     
    @TableField(value="icon")
    @Schema(name="icon",description="图标")
    private String icon;

    /**
     * 支付类型（1-电子支付、2-银行卡）
     */     
    @TableField(value="payment_type")
    @Schema(name="paymentType",description="支付类型（1-电子支付、2-银行卡）")
    private PaymentType paymentType;


}

