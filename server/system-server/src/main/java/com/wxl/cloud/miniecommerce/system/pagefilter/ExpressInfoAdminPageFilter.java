package com.wxl.cloud.miniecommerce.system.pagefilter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.annotation.FilterField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName  ：ExpressInfoAdminPageFilter
 * @description：自定义类
 * @author     ：wxl
 * @date       ：2024/12/14 12:15
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExpressInfoAdminPageFilter {

    @Schema(name = "expressNo", description = "快递编号")
    @FilterField(column = "express_no", compareType = FilterField.CompareType.EQ)
    private String expressNo;

    @Schema(name = "expressType", description = "快递类型")
    @FilterField(column = "express_type", compareType = FilterField.CompareType.EQ)
    private Integer expressType;

    @Schema(name = "startTime", description = "开始时间")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.GE)
    private String startTime;

    @Schema(name = "endTime", description = "结束时间")
    @FilterField(column = "create_time", compareType = FilterField.CompareType.LE)
    private String endTime;

    @Schema(name = "status", description = "状态")
    @FilterField(column = "status", compareType = FilterField.CompareType.EQ)
    private Integer status;
}
