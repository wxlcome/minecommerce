package com.wxl.cloud.miniecommerce.model.entity.goods;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Category
 * @description：分类
 * @author     ：wxl
 * @date       ：2024/12/05 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_category")
@Schema(name="Category",description="分类")
public class Category extends BaseEntity {

    private static final long serialVersionUID = 975898003527716489L;

    /**
     * 父分类id
     */     
    @TableField(value="super_id")
    @Schema(name="superId",description="父分类id")
    private Long superId;
    /**
     * 分类中文名称
     */     
    @TableField(value="cn_name")
    @Schema(name="cnName",description="分类中文名称")
    private String cnName;
    /**
     * 分类英文名称
     */     
    @TableField(value="en_name")
    @Schema(name="enName",description="分类英文名称")
    private String enName;
    /**
     * 图标
     */     
    @TableField(value="icon")
    @Schema(name="icon",description="图标")
    private String icon;
    /**
     * 概念图
     */     
    @TableField(value="idea_img")
    @Schema(name="ideaImg",description="概念图")
    private String ideaImg;


}

