package com.wxl.cloud.miniecommerce.system.vo.admin;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName  ：FeedbackAdminPageVO
 * @description：反馈管理分页VO
 * @author     ：wxl
 * @date       ：2024/12/14 22:54
 */
@Data
@Schema(name="FeedbackAdminPageVO",description="反馈管理分页VO")
public class FeedbackAdminPageVO implements Serializable {

    private static final long serialVersionUID = -40565795040450185L;

    /**
     * 数据行id
     */
    @Schema(name="id",description="数据行id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * 邮箱
     */
    @Schema(name="email",description="邮箱")
    private String email;
    /**
     * 主题
     */
    @Schema(name="subject",description="主题")
    private String subject;
    /**
     * 内容
     */
    @Schema(name="content",description="内容")
    private String content;
    /**
     * 创建时间
     */
    @Schema(name="createTime",description="创建时间",accessMode = Schema.AccessMode.READ_ONLY)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
}
