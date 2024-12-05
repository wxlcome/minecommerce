package com.wxl.cloud.miniecommerce.model.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wxl.cloud.miniecommerce.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName  ：Feedback
 * @description：反馈
 * @author     ：wxl
 * @date       ：2024/12/05 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_feedback")
@Schema(name="Feedback",description="反馈")
public class Feedback extends BaseEntity {

    private static final long serialVersionUID = -40565795040450185L;

    /**
     * 邮箱
     */     
    @TableField(value="email")
    @Schema(name="email",description="邮箱")
    private String email;
    /**
     * 主题
     */     
    @TableField(value="subject")
    @Schema(name="subject",description="主题")
    private String subject;
    /**
     * 内容
     */     
    @TableField(value="content")
    @Schema(name="content",description="内容")
    private String content;


}

