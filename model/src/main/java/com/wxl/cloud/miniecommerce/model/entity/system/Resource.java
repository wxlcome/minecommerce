package com.wxl.cloud.miniecommerce.model.entity.system;

import java.util.Date;

import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.ResourceObjectType;
import com.wxl.cloud.miniecommerce.model.enums.system.ResourceType;
import io.swagger.v3.oas.annotations.media.Schema;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import lombok.*;

/**
 * @ClassName  ：Resource
 * @description：资源
 * @author     ：wxl
 * @date       ：2024/12/08 13:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_resource")
@Schema(name="Resource",description="资源")
public class Resource extends BaseEntity {

    private static final long serialVersionUID = 999947236582971404L;

    /**
     * 对象id
     */     
    @TableField(value="object_id")
    @Schema(name="objectId",description="对象id")
    private Long objectId;
    /**
     * 对象类型
     */     
    @TableField(value="object_type")
    @Schema(name="objectType",description="对象类型")
    private ResourceObjectType objectType;
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

