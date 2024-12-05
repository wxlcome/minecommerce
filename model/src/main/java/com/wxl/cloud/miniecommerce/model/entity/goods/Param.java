package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Param
 * @description：参数
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_param")
@Schema(name="Param",description="参数")
public class Param extends BaseEntity {

    private static final long serialVersionUID = -14090270486198124L;

    /**
     * 分类id
     */     
    @TableField(value="category_id")
    @Schema(name="categoryId",description="分类id")
    private Long categoryId;
    /**
     * 中文名称
     */     
    @TableField(value="cn_name")
    @Schema(name="cnName",description="中文名称")
    private String cnName;
    /**
     * 英文名称
     */     
    @TableField(value="en_name")
    @Schema(name="enName",description="英文名称")
    private String enName;


}

