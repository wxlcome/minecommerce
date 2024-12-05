package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Brand
 * @description：品牌
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_brand")
@Schema(name="Brand",description="品牌")
public class Brand extends BaseEntity {

    private static final long serialVersionUID = -38968074395777955L;

    /**
     * 品牌中文名称
     */     
    @TableField(value="cn_name")
    @Schema(name="cnName",description="品牌中文名称")
    private String cnName;
    /**
     * 品牌英文名称
     */     
    @TableField(value="en_name")
    @Schema(name="enName",description="品牌英文名称")
    private String enName;
    /**
     * 品牌logo
     */     
    @TableField(value="logo")
    @Schema(name="logo",description="品牌logo")
    private String logo;


}

