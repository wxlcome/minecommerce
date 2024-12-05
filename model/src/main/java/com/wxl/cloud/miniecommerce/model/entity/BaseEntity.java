package com.wxl.cloud.miniecommerce.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName  ：BaseEntity
 * @description：实体基类
 * @author     ：wxl
 * @date       ：2024/08/28 12:51
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) //json序列化时，null字段不显示
public abstract class BaseEntity implements Serializable {

    /**
     * 数据行id
     */
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    @Schema(name="id",description="数据行id")
    private Long id;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    @Schema(name="updateTime",description="更新时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Date updateTime;


}
