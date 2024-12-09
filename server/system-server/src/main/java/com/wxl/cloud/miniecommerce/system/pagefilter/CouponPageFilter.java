package com.wxl.cloud.miniecommerce.system.pagefilter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wxl.cloud.miniecommerce.model.annotation.FilterField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CouponPageFilter {

    @Schema(name = "couponName", description = "商品编号")
    @FilterField(column = "coupon_name", compareType = FilterField.CompareType.FULL_LIKE)
    private String couponName;

    @Schema(name = "couponType", description = "优惠券类型")
    @FilterField(column = "coupon_type", compareType = FilterField.CompareType.EQ)
    private Integer couponType;

    @Schema(name = "startNumber", description = "开始金额")
    @FilterField(column = "number", compareType = FilterField.CompareType.GE)
    private BigDecimal startNumber;

    @Schema(name = "endNumber", description = "结束金额")
    @FilterField(column = "number", compareType = FilterField.CompareType.LE)
    private BigDecimal endNumber;

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