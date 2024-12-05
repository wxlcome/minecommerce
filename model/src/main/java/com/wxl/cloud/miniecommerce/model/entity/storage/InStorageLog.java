package com.wxl.cloud.miniecommerce.model.entity.storage;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.storage.InStorageType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：InStorageLog
 * @description：入库日志
 * @author     ：wxl
 * @date       ：2024/12/05 13:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_in_storage_log")
@Schema(name="InStorageLog",description="入库日志")
public class InStorageLog extends BaseEntity {

    private static final long serialVersionUID = 168866888746996469L;

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
     * 商品规格组id
     */     
    @TableField(value="spec_group_id")
    @Schema(name="specGroupId",description="商品规格组id")
    private Long specGroupId;
    /**
     * 规格组名称
     */     
    @TableField(value="spec_group_name")
    @Schema(name="specGroupName",description="规格组名称")
    private String specGroupName;
    /**
     * 数量
     */     
    @TableField(value="amount")
    @Schema(name="amount",description="数量")
    private Integer amount;
    /**
     * 入库类型(1-营销、2-采购、3-调动)
     */     
    @TableField(value="in_storage_type")
    @Schema(name="inStorageType",description="入库类型(1-营销、2-采购、3-调动)")
    private InStorageType inStorageType;
    /**
     * 附加信息
     */     
    @TableField(value="additional")
    @Schema(name="additional",description="附加信息")
    private String additional;


}

