package com.wxl.cloud.miniecommerce.system.vo.admin;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.entity.storage.Warehouse;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressAddr;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressCompany;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.ExpressType;
import com.wxl.cloud.miniecommerce.model.enums.system.ObjectType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName  ：ExpressInfoAdminVO
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/12/14 12:27
 */
@Data
@Schema(name="ExpressInfoAdminVO",description="快递信息管理VO")
public class ExpressInfoAdminVO {

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
     * 快递公司
     */
    @Schema(name="company",description="快递公司")
    private ExpressCompany company;

    /**
     * 快递类型（1-发货，2-退货）
     */
    @Schema(name="expressType",description="快递类型（1-发货，2-退货）")
    private ExpressType expressType;

    /**
     * 地址信息
     */
    @Schema(name="expressAddr",description="地址信息")
        private ExpressAddr expressAddr;

    /**
     * 发货/收货仓库信息
     */
    @Schema(name="warehouse",description="发货/收货仓库信息")
    private Warehouse warehouse;

    /**
     * 快递动态
     */
    @Schema(name="trends",description="快递动态")
    private List<ExpressTrends> trends;

    /**
     * 状态(1-未收货，2-已收货)
     */
    @Schema(name="status",description="状态(1-未收货，2-已收货)")
    private ExpressStatus status;


}
