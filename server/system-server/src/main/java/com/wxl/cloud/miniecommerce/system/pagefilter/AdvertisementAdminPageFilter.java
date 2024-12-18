package com.wxl.cloud.miniecommerce.system.pagefilter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wxl.cloud.miniecommerce.common.util.mybatisplus.annotation.FilterField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertisementAdminPageFilter {

    @Schema(name = "goodsNo", description = "商品编号")
    @FilterField(column = "goods_no", compareType = FilterField.CompareType.EQ)
    private String goodsNo;

    @Schema(name = "goodsName", description = "商品名称")
    @FilterField(column = "goods_name", compareType = FilterField.CompareType.FULL_LIKE)
    private String goodsName;

    @Schema(name = "title", description = "标题")
    @FilterField(column = "title", compareType = FilterField.CompareType.FULL_LIKE)
    private String title;

    @Schema(name = "description", description = "描述")
    @FilterField(column = "description", compareType = FilterField.CompareType.FULL_LIKE)
    private String description;

    @Schema(name = "status", description = "状态")
    @FilterField(column = "status", compareType = FilterField.CompareType.EQ)
    private Integer status;
}