package com.wxl.cloud.miniecommerce.model.entity.storage;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.storage.OutStorageType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：OutStorageLog
 * @description：出库日志
 * @author     ：wxl
 * @date       ：2024/12/05 13:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_out_storage_log")
@Schema(name="OutStorageLog",description="出库日志")
public class OutStorageLog extends BaseEntity {

    private static final long serialVersionUID = -60888245402853701L;

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
     * 出库类型(1-营销、2-调动)
     */     
    @TableField(value="out_storage_type")
    @Schema(name="outStorageType",description="出库类型(1-营销、2-调动)")
    private OutStorageType outStorageType;
    /**
     * 附加信息
     */     
    @TableField(value="additional")
    @Schema(name="additional",description="附加信息")
    private String additional;


}

