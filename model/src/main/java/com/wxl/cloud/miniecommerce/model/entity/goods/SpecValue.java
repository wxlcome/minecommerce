package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：SpecValue
 * @description：规格值
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_spec_value")
@Schema(name="SpecValue",description="规格值")
public class SpecValue extends BaseEntity {

    private static final long serialVersionUID = -55034403983340762L;

    /**
     * 规格id
     */     
    @TableField(value="spec_id")
    @Schema(name="specId",description="规格id")
    private Long specId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;


}

