package com.wxl.cloud.miniecommerce.system.pagefilter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.annotation.FilterField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackAdminPageFilter {

    @Schema(name = "email", description = "邮箱")
    @FilterField(column = "email", compareType = FilterField.CompareType.EQ)
    private String email;

    @Schema(name = "subject", description = "主题")
    @FilterField(column = "subject", compareType = FilterField.CompareType.FULL_LIKE)
    private String subject;

    @Schema(name = "content", description = "内容")
    @FilterField(column = "content", compareType = FilterField.CompareType.FULL_LIKE)
    private String content;

    @Schema(name = "startTime", description = "开始时间")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.GE)
    private String startTime;

    @Schema(name = "endTime", description = "结束时间")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.LE)
    private String endTime;

}