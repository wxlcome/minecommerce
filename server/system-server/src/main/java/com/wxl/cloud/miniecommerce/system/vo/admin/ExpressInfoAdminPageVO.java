package com.wxl.cloud.miniecommerce.system.vo.admin;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressType;
import com.wxl.cloud.miniecommerce.model.enums.system.ObjectType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * @ClassName  ：ExpressInfoAdminPageVO
 * @description：快递信息管理分页VO
 * @author     ：wxl
 * @date       ：2024/12/13 15:26
 */
@Data
@Schema(name="ExpressInfoAdminPageVO",description="快递信息管理分页VO")
public class ExpressInfoAdminPageVO implements Serializable {

    private static final long serialVersionUID = 116173045955132665L;

    /**
     * 数据行id
     */
    @Schema(name="id",description="数据行id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 对象id
     */
    @TableField(value="object_id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long objectId;
    /**
     * 对象类型
     */
    @TableField(value="object_type")
    private ObjectType objectType;
    /**
     * 快递编号
     */
    @Schema(name="expressNo",description="快递编号")
    private String expressNo;
    /**
     * 快递公司id
     */
    @Schema(name="companyId",description="快递公司id")
    private Integer companyId;
    /**
     * 快递公司名称
     */
    @Schema(name="companyName",description="快递公司名称")
    private String companyName;
    /**
     * 公司编码
     */
    @Schema(name="companyCode",description="公司编码")
    private String companyCode;
    /**
     * 快递公司图标
     */
    @Schema(name="companyIcon",description="快递公司图标")
    private String companyIcon;
    /**
     * 快递类型（1-发货，2-退货）
     */
    @Schema(name="expressType",description="快递类型（1-发货，2-退货）")
    private ExpressType expressType;
    /**
     * 地址信息id
     */
    @Schema(name="expressAddrId",description="地址信息id")
    private Long expressAddrId;
    /**
     * 发货/收货仓库id
     */
    @Schema(name="warehouseId",description="发货/收货仓库id")
    private Long warehouseId;
    /**
     * 发货/收货仓库名称
     */
    @Schema(name="warehouseName",description="发货/收货仓库名称")
    private String warehouseName;
    /**
     * 状态(1-未收货，2-已收货)
     */
    @Schema(name="status",description="状态(1-未收货，2-已收货)")
    private ExpressStatus status;

    /**
     * 创建时间
     */
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;


}

