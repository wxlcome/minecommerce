package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：LabelValue
 * @description：标签值
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_label_value")
@Schema(name="LabelValue",description="标签值")
public class LabelValue extends BaseEntity {

    private static final long serialVersionUID = -36107737359721408L;

    /**
     * 标签id
     */     
    @TableField(value="label_id")
    @Schema(name="labelId",description="标签id")
    private Long labelId;
    /**
     * 值
     */     
    @TableField(value="value")
    @Schema(name="value",description="值")
    private String value;


}

