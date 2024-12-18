package com.wxl.cloud.miniecommerce.model.entity.system;

import java.util.Date;

import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressType;
import com.wxl.cloud.miniecommerce.model.enums.system.ObjectType;
import io.swagger.v3.oas.annotations.media.Schema;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import lombok.*;

/**
 * @ClassName  ：ExpressInfo
 * @description：快递信息
 * @author     ：wxl
 * @date       ：2024/12/13 15:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_express_info")
@Schema(name="ExpressInfo",description="快递信息")
public class ExpressInfo extends BaseEntity {

    private static final long serialVersionUID = 116173045955132665L;

    /**
     * 对象id
     */     
    @TableField(value="object_id")
    @Schema(name="objectId",description="对象id")
    private Long objectId;
    /**
     * 对象类型
     */     
    @TableField(value="object_type")
    @Schema(name="objectType",description="对象类型")
    private ObjectType objectType;
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
     * 地址信息id
     */     
    @TableField(value="express_addr_id")
    @Schema(name="expressAddrId",description="地址信息id")
    private Long expressAddrId;
    /**
     * 发货/收货仓库id
     */     
    @TableField(value="warehouse_id")
    @Schema(name="warehouseId",description="发货/收货仓库id")
    private Long warehouseId;
    /**
     * 发货/收货仓库名称
     */     
    @TableField(value="warehouse_name")
    @Schema(name="warehouseName",description="发货/收货仓库名称")
    private String warehouseName;
    /**
     * 状态(1-未收货，2-已收货)
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态(1-未收货，2-已收货)")
    private ExpressStatus status;


}

