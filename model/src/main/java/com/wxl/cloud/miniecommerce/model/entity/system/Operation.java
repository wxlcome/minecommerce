package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import com.wxl.cloud.miniecommerce.model.enums.system.OperationStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName  ：Operation
 * @description：活动
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_operation")
@Schema(name="Operation",description="活动")
public class Operation extends BaseEntity {

    private static final long serialVersionUID = -31298769765763182L;

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
     * 活动类型（1-折扣、2-秒杀）
     */     
    @TableField(value="operation_type")
    @Schema(name="operationType",description="活动类型（1-折扣、2-秒杀）")
    private Integer operationType;
    /**
     * 参数
     */     
    @TableField(value="param")
    @Schema(name="param",description="参数")
    private String param;
    /**
     * 开始时间
     */     
    @TableField(value="start_time")
    @Schema(name="startTime",description="开始时间")
    private Date startTime;
    /**
     * 结束时间
     */     
    @TableField(value="end_time")
    @Schema(name="endTime",description="结束时间")
    private Date endTime;

    /**
     * 状态（0-禁用、1-启用）
     */     
    @TableField(value="status")
    @Schema(name="status",description="状态（0-禁用、1-启用）")
    private OperationStatus status;


}

