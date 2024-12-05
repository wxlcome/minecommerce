package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Advertisement
 * @description：广告
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_advertisement")
@Schema(name="Advertisement",description="广告")
public class Advertisement extends BaseEntity {

    private static final long serialVersionUID = 512957097802397599L;

    /**
     * 商品id
     */     
    @TableField(value="goods_id")
    @Schema(name="goodsId",description="商品id")
    private Long goodsId;
    /**
     * 标题
     */     
    @TableField(value="title")
    @Schema(name="title",description="标题")
    private String title;
    /**
     * 描述
     */     
    @TableField(value="description")
    @Schema(name="description",description="描述")
    private String description;
    /**
     * 概念图
     */     
    @TableField(value="idea_img")
    @Schema(name="ideaImg",description="概念图")
    private String ideaImg;
    /**
     * 顺序
     */     
    @TableField(value="index")
    @Schema(name="index",description="顺序")
    private Integer index;


}

