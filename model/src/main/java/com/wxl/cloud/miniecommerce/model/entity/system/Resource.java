package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.ResourceType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Resource
 * @description：资源
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_resource")
@Schema(name="Resource",description="资源")
public class Resource extends BaseEntity {

    private static final long serialVersionUID = -38902120643189385L;

    /**
     * 对象id
     */     
    @TableField(value="object_id")
    @Schema(name="objectId",description="对象id")
    private Long objectId;
    /**
     * 资源名称
     */     
    @TableField(value="resource_name")
    @Schema(name="resourceName",description="资源名称")
    private String resourceName;
    /**
     * 资源类型（1-图片、2-视频）
     */     
    @TableField(value="resource_type")
    @Schema(name="resourceType",description="资源类型（1-图片、2-视频）")
    private ResourceType resourceType;
    /**
     * 资源url
     */     
    @TableField(value="resource_url")
    @Schema(name="resourceUrl",description="资源url")
    private String resourceUrl;


}

