package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ExpressInfo
 * @description：快递信息
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_express_info")
@Schema(name="ExpressInfo",description="快递信息")
public class ExpressInfo extends BaseEntity {

    private static final long serialVersionUID = -71408171482374350L;

    /**
     * 对象id
     */     
    @TableField(value="object_id")
    @Schema(name="objectId",description="对象id")
    private Long objectId;
    /**
     * 快递编号
     */     
    @TableField(value="express_no")
    @Schema(name="expressNo",description="快递编号")
    private String expressNo;
    /**
     * 快递公司id
     */     
    @TableField(value="company_id")
    @Schema(name="companyId",description="快递公司id")
    private Integer companyId;
    /**
     * 快递公司名称
     */     
    @TableField(value="company_name")
    @Schema(name="companyName",description="快递公司名称")
    private String companyName;
    /**
     * 公司编码
     */     
    @TableField(value="company_code")
    @Schema(name="companyCode",description="公司编码")
    private String companyCode;
    /**
     * 快递公司图标
     */     
    @TableField(value="company_icon")
    @Schema(name="companyIcon",description="快递公司图标")
    private String companyIcon;
    /**
     * 快递类型（1-发货，2-退货）
     */     
    @TableField(value="express_type")
    @Schema(name="expressType",description="快递类型（1-发货，2-退货）")
    private ExpressType expressType;
    /**
     * 收件人地址信息id
     */     
    @TableField(value="receiver_addr_id")
    @Schema(name="receiverAddrId",description="收件人地址信息id")
    private Long receiverAddrId;
    /**
     * 发货人地址信息id
     */     
    @TableField(value="sender_addr_id")
    @Schema(name="senderAddrId",description="发货人地址信息id")
    private Long senderAddrId;
    /**
     * 发货/收货仓库id
     */     
    @TableField(value="warehouse_id")
    @Schema(name="warehouseId",description="发货/收货仓库id")
    private Long warehouseId;


}

