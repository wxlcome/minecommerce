package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：ParamValue
 * @description：$tableInfo.comment
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_param_value")
@Schema(name="ParamValue",description="")
public class ParamValue extends BaseEntity {

    private static final long serialVersionUID = 247822337913512337L;

    /**
     * 参数id
     */     
    @TableField(value="param_id")
    @Schema(name="paramId",description="参数id")
    private Long paramId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;


}

