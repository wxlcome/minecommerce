package com.wxl.cloud.miniecommerce.system.pagefilter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.annotation.FilterField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperationAdminPageFilter {


    @Schema(name = "title", description = "标题")
    @FilterField(column = "title", compareType = FilterField.CompareType.FULL_LIKE)
    private String title;

    @Schema(name = "description", description = "描述")
    @FilterField(column = "description", compareType = FilterField.CompareType.FULL_LIKE)
    private String description;

    @Schema(name = "startTime", description = "开始时间")
    @FilterField(column = "start_time", compareType = FilterField.CompareType.GE)
    private String startTime;

    @Schema(name = "endTime", description = "结束时间")
    @FilterField(column = "end_time", compareType = FilterField.CompareType.LE)
    private String endTime;

    @Schema(name = "createTimeBegin", description = "创建时间-开始")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.GE)
    private String createTimeBegin;

    @Schema(name = "createTimeEnd", description = "创建时间-结束")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.LE)
    private String createTimeEnd;

    @Schema(name = "status", description = "状态")
    @FilterField(column = "status", compareType = FilterField.CompareType.EQ)
    private Integer status;


}