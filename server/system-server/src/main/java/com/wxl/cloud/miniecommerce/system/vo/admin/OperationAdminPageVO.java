package com.wxl.cloud.miniecommerce.system.vo.admin;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wxl.cloud.miniecommerce.model.enums.system.OperationStatus;
import com.wxl.cloud.miniecommerce.model.enums.system.OperationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName  ：OperationAdminPageVO
 * @description：活动分页管理VO
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@Schema(name="OperationAdminPageVO",description="活动分页管理VO")
public class OperationAdminPageVO implements Serializable {

    private static final long serialVersionUID = -31298769765763182L;

    /**
     * 数据行id
     */
    @Schema(name="id",description="数据行id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 标题
     */
    @Schema(name="title",description="标题")
    private String title;
    /**
     * 描述
     */
    @Schema(name="description",description="描述")
    private String description;
    /**
     * 概念图
     */
    @Schema(name="ideaImg",description="概念图")
    private String ideaImg;
    /**
     * 活动类型（1-折扣、2-秒杀）
     */
    @Schema(name="operationType",description="活动类型（1-折扣、2-秒杀）")
    private OperationType operationType;
    /**
     * 参数
     */
    @Schema(name="param",description="参数")
    private String param;
    /**
     * 开始时间
     */
    @Schema(name="startTime",description="开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;
    /**
     * 结束时间
     */
    @Schema(name="endTime",description="结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;

    /**
     * 状态（0-禁用、1-启用）
     */
    @Schema(name="status",description="状态（0-禁用、1-启用）")
    private OperationStatus status;

    /**
     * 创建时间
     */
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;


}

